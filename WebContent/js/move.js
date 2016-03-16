$(function () {
    var TIMER;
 
    function move(){
       
        $(".target").animate({
            'top': Math.round( Math.random()*90 ) + "%",
            'left': Math.round( Math.random()*90 ) + "%"
        },200);
    }
     
    window.onload = function(){
    	clearInterval(TIMER);
        TIMER = setInterval(function(){move()}, 1500);
    	} 
    
    $('.target').click(function(){
    	location.href = "signup";
    });
    
   
     
});