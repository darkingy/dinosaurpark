document.addEventListener('DOMContentLoaded', function() {
    const dinoGalleries = document.querySelectorAll('.dino-gallery');

    dinoGalleries.forEach(gallery => {
        gallery.addEventListener('click', function() {
            const dinoCard = this.nextElementSibling;
            this.style.display = 'none'; // <article> 숨김
            dinoCard.style.display = 'flex'; // <div class="dino-card"> 표시

            // dinoCard를 클릭했을 때의 이벤트 리스너
            const hideCardShowArticle = () => {
                dinoCard.style.display = 'none'; // <div class="dino-card"> 숨김
                gallery.style.display = 'flex'; // <article> 다시 표시
                dinoCard.removeEventListener('click', hideCardShowArticle); // 이벤트 리스너 제거
            };

            // 10초 후에 실행되는 로직
            setTimeout(hideCardShowArticle, 10000); // 10000ms = 10초

            // dinoCard 클릭 시 즉시 실행되는 로직
            dinoCard.addEventListener('click', hideCardShowArticle);
        });
    });
});
