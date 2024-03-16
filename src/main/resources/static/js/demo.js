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

//수정 필수
//앵커 버튼 눌렀을 때, 자연스러운 스크롤 액션
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

//수정 필수
//메인 페이지의 로고가 스크롤 해서 아래로 내려가면 로고가 내비게이션 바로 이동하는 액션
document.addEventListener("DOMContentLoaded", function() {
  const heroLogo = document.querySelector('.hero__logo');
  const navLogo = document.querySelector('.nav__logo img');

  const observer = new IntersectionObserver(entries => {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        //hero__logo가 스크롤에 나타날 때
        navLogo.style.transition = 'transform 0.5s ease-in-out';
        navLogo.style.transform = 'translateY(0)';
      } else {
        //hero__logo가 스크롤에 사라질 때
        navLogo.style.transition = 'transform 0.5s ease-in-out';
        navLogo.style.transform = 'translateY(-100%);'
      }
    });
  }, {threshold: 0.5 }); //스크롤이 50% 이상 되었을 때 이벤트 발생

  observer.observe(heroLogo);
});