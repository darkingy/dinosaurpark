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
  const content = section.querySelector("[data-content]");
  if (content) { // content가 실제로 존재하면 그 다음 단계 진행
    const sectionChildren = [...content.children];

    sectionChildren.forEach((el, index) => {
      el.style.setProperty("--delay", `${index * 250}ms`);
    });

    observer.observe(section);
  }
});

//햄버거 효과
document.addEventListener('DOMContentLoaded', function() {
    const hamburger = document.querySelector('.hamburger-menu');
    const navList = document.querySelector('.nav__list');
    const navItems = document.querySelectorAll('.nav__item'); // 네비게이션 항목 선택
    const navLogo = document.querySelector('.nav__item.nav__logo');
    hamburger.addEventListener('click', function() {
        // 'active' 클래스 토글을 통해 네비게이션 항목을 표시하거나 숨김
        navList.classList.toggle('active');

        // .nav__list가 'active' 상태일 때 항목을 표시
        if (navList.classList.contains('active')) {
            navItems.forEach(item => item.style.display = 'block');
            navLogo.style.display = "none";
        } else {
            navItems.forEach(item => item.style.display = 'none');
            navLogo.style.display = 'flex';
        }
    });

    window.addEventListener('resize', function() {
      // 화면이 넓어졌을 때 네비게이션 항목 스타일 리셋
      if (window.innerWidth > 700) {
          navItems.forEach(item => item.style.display = ''); // 인라인 스타일 제거
          navList.classList.remove('active'); // active 클래스 제거
      }
  });
});
