function updateClock() {
    const options = { timeZone: 'Pacific/Honolulu', hour: '2-digit', minute: '2-digit', second: '2-digit', hour12: true };
    const formatter = new Intl.DateTimeFormat([], options);
    const timeString = formatter.format(new Date());
    document.getElementById('clock').textContent = timeString;
}

// Update the clock every second
setInterval(updateClock, 1000);

// Initial call to display the clock immediately
updateClock();
