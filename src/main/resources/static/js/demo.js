document.addEventListener('DOMContentLoaded', function () {
  const sections = [...document.querySelectorAll("section")];
  const navLogo = document.querySelector(".nav__logo");

  let options = {
    rootMargin: "0px",
    threshold: 0.75
  };

  const callback = (entries, observer) => {
    entries.forEach(entry => {
      const { target } = entry;

      // hero 섹션이 아니며, 교차 비율이 0.75 이상일 때
      if (entry.intersectionRatio >= 0.75 && !target.classList.contains("hero")) {
        target.classList.add("is-visible");
        // dinosaur와 employee 섹션은 로직에서 제외
        if (!(target.id === "dinosaur" || target.id === "employee")) {
          navLogo.classList.add("is-visible");
        }
      } else {
        // hero 섹션으로 돌아갈 때, 모든 섹션의 is-visible 클래스 제거
        if (target.classList.contains("hero")) {
          navLogo.classList.remove("is-visible");
        } else {
          // dinosaur와 employee 섹션에서는 로고의 가시성을 제거하지 않음
          if (!(target.id === "dinosaur" || target.id === "employee")) {
            target.classList.remove("is-visible");
          }
        }
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
});

document.addEventListener('DOMContentLoaded', () => {
  // section-style 클래스를 가진 .box 내부의 img 태그 선택
  const images = document.querySelectorAll('.section-style .box img');
  const titles = document.querySelectorAll('.section__pro-intro');

  const options = {
    rootMargin: '0px',
    threshold: 0.75 // 요소가 75% 보이는 순간 콜백 실행
  };

  const observerCallback = (entries, observer) => {
    entries.forEach(entry => {
      if (entry.intersectionRatio >= 0.75) {
        // 교차 비율이 0.75 이상이면 .is-fade 클래스 추가
        entry.target.classList.add('is-fade');
        entry.target.classList.remove('is-fadeout');
      } else {
        entry.target.classList.remove('is-fade');
        entry.target.classList.add('is-fadeout');
      }
    });
  };

  // IntersectionObserver 인스턴스 생성 및 이미지 관찰 시작
  const observer = new IntersectionObserver(observerCallback, options);
  images.forEach(image => observer.observe(image));
  titles.forEach(title => observer.observe(title));
});

//햄버거 효과
document.addEventListener('DOMContentLoaded', function () {
  const hamburger = document.querySelector('.hamburger-menu');
  const navList = document.querySelector('.nav__list');
  const navItems = document.querySelectorAll('.nav__item'); // 네비게이션 항목 선택
  const navLogo = document.querySelector('.nav__item.nav__logo');
  hamburger.addEventListener('click', function () {
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

  window.addEventListener('resize', function () {
    // 화면이 넓어졌을 때 네비게이션 항목 스타일 리셋
    if (window.innerWidth > 700) {
      navItems.forEach(item => item.style.display = ''); // 인라인 스타일 제거
      navList.classList.remove('active'); // active 클래스 제거
    }
  });
});

document.getElementById('error').addEventListener('click', function (event) {
  event.preventDefault(); // 기본 동작(링크 이동)을 막습니다.
  swal('Comming Soon!',
    'Preparing Pages',
    'warning');
});
