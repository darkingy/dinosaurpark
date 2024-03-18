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
document.querySelector('.nav__list').addEventListener('click', e=>{
  if(e.target.nodeName === 'LI') {
    let id_value = e.target.dataset.link;
    document.querySelector(id_value).scrollIntoView({behavior : 'smooth'});
  }
});

//수정 필수
//메인 페이지의 로고가 스크롤 해서 아래로 내려가면 로고가 내비게이션 바로 이동하는 액션
