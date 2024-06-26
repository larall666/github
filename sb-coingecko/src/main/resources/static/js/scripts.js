document.addEventListener('DOMContentLoaded', function () {
  var coinFilter = document.getElementById('coinFilter');
  var tbody = document.getElementById('coinDataBody');
  var coinRows = document.querySelectorAll('.coinRow');


  coinFilter.addEventListener('input',function(){
    var filter=coinFilter.value.toUpperCase();
  
  coinRows.forEach(function (row){
    var coinId = row.querySelector('td:nth-child(2)').textContent.toUpperCase();

    if(coinId.indexOf(filter)>-1){
      row.style.display='';//Show the row
    } else{
      row.style.display='none';//Hide the row
    
    }
  });
});

  
  const filterRows = () => {
    var filter = coinFilter.value.toUpperCase();
    $('.coinRow').each(function() {
      var coinId = $(this).find('td:nth-child(2)').text().toUpperCase();
      $(this).toggle(coinId.includes(filter));
    });
  };


  const fetchCoinData = () => {
    $.ajax({
      url: '/coin-data',
      type: 'GET',
      success: function(data) {
        // tbody.innerHTML = '';//
        // data.forEach(coin => {
        //   const row = document.createElement('tr');
        //   row.className = 'coinRow';
        //   row.innerHTML = `
        //     <td><img src="${coin.image}" alt="Coin Image" height="30"></td>
        //     <td>${coin.id}</td>
        //     <td>${coin.currentPrice}</td>
        //   `;
        //   tbody.appendChild(row);
        // });//
        filterRows(); // Apply filter after fetching data
      },
      error: function(error) {
        console.error('Error fetching coin data:', error);
      }
    });
  };
  

  fetchCoinData();
  
  // Refresh data every 10 seconds
  setInterval(fetchCoinData, 10000);

  coinFilter.addEventListener('input', filterRows);
});