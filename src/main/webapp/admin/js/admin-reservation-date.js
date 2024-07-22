document.addEventListener('DOMContentLoaded', function () {
    const monthYear = document.getElementById('monthYear');  // 월/연 표시 요소
    const daysContainer = document.getElementById('days');  // 날짜 표시 요소
    const prevMonthButton = document.getElementById('prevMonth');  // 이전 달 버튼
    const nextMonthButton = document.getElementById('nextMonth');  // 다음 달 버튼
    
    let currentMonth = new Date().getMonth();  // 현재 월
    let currentYear = new Date().getFullYear();  // 현재 연도

    const months = [
        'January', 'February', 'March', 'April', 'May', 'June',
        'July', 'August', 'September', 'October', 'November', 'December'
    ];

    // 캘린더 렌더링 함수
    function renderCalendar(month, year) {
        daysContainer.innerHTML = '';  // 날짜 표시 요소 초기화
        monthYear.innerText = `${months[month]} ${year}`;  // 월/연 업데이트

        const firstDay = new Date(year, month, 1).getDay();  // 해당 월의 첫날 요일
        const daysInMonth = new Date(year, month + 1, 0).getDate();  // 해당 월의 총 날짜 수

        // 빈 칸 추가
        for (let i = 0; i < firstDay; i++) {
            const emptyCell = document.createElement('div');
            daysContainer.appendChild(emptyCell);
        }

        // 날짜 추가
        for (let day = 1; day <= daysInMonth; day++) {
            const dayCell = document.createElement('div');
            const dayLink = document.createElement('a');
            dayLink.innerText = day;
            dayLink.href = `doPtPlanCheck.admin?year=${year}&month=${month + 1}&day=${day}$`;
            dayCell.appendChild(dayLink);
            daysContainer.appendChild(dayCell);
        }
    }

    // 월 변경 함수
    function changeMonth(increment) {
        currentMonth += increment;
        if (currentMonth < 0) {
            currentMonth = 11;
            currentYear--;
        } else if (currentMonth > 11) {
            currentMonth = 0;
            currentYear++;
        }
        renderCalendar(currentMonth, currentYear);  // 새로운 월로 캘린더 렌더링
    }

    // 이전 달 버튼 클릭 이벤트
    prevMonthButton.addEventListener('click', () => changeMonth(-1));
    // 다음 달 버튼 클릭 이벤트
    nextMonthButton.addEventListener('click', () => changeMonth(1));

    renderCalendar(currentMonth, currentYear);  // 초기 캘린더 렌더링
});