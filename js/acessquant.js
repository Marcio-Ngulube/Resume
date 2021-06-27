/*-----------------------------------------------------------------------------------
/*
/* Read file
/*-----------------------------------------------------------------------------------*/

 jQuery(document).ready(function($) {

 //var filePath = 'https://v2.jokeapi.dev/joke/Any'; 

var filePath = 'https://xo4ugng2li.execute-api.us-east-1.amazonaws.com/production/access'; 

var numberOfViews=1;

 
$.getJSON(filePath, function( data ) {
  /*$.each( data, function( key, val ) {
    alert(val["setup"]);
  });*/ 
  //alert(data.acess);
  numberOfViews=data.acess;
  $("#counter").text("Acessed "+numberOfViews+" times");
		
}); 

 
}); 

   


/*-----------------------------------------------------------------------------------
/*
/* End of read file
/*-----------------------------------------------------------------------------------*/
