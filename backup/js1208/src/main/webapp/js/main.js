/**
 * 
 */
 
 var flag=0;
   function btn(){
       var btnColor = document.querySelector("#d01");
	   if(flag==0){
		   btnColor.style.backgroundColor = "red";
		   btnColor.style.borderRadius ="50%";
		   flag=1;
	   }else{
		   btnColor.style.backgroundColor = "green";
		   btnColor.style.borderRadius ="";
		   flag=0;
	   }
   }