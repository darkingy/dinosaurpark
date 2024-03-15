const sections = [...document.querySelectorAll("section")];

let options = {
  rootMargin: "0px",
  threshold: 0.75
};

const callback = (entries, observer) => {
  entries.forEach(entry => {
		const { target } = entry;
		
		if (entry.intersectionRatio >= 0.75) {
			target.classList.add("is-visible");
		} else {
			target.classList.remove("is-visible");
		}
  });
};

const observer = new IntersectionObserver(callback, options);

sections.forEach((section, index) => {
  const sectionChildren = [...section.querySelector("[data-content]").children];

  sectionChildren.forEach((el, index) => {
    el.style.setProperty("--delay", `${index * 250}ms`);
  });

  observer.observe(section);
});

document.addEventListener("DOMContentLoaded", function() {
  // 모든 앵커 링크를 선택합니다.
  const links = document.querySelectorAll('a[href^="#"]');

  // 각 링크에 대해 클릭 이벤트 리스너를 추가합니다.
  for (const link of links) {
    link.addEventListener('click', clickHandler);
  }

  function clickHandler(e) {
    e.preventDefault(); // 기본 이동 동작을 방지합니다.
    const href = this.getAttribute("href"); // 클릭된 링크의 href 값을 가져옵니다.
    const offsetTop = document.querySelector(href).offsetTop; // 목표 섹션의 상단까지의 거리를 계산합니다.

    // 부드러운 스크롤을 실행합니다.
    window.scrollTo({
      top: offsetTop,
      behavior: "smooth"
    });
  }
});