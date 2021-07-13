
var  arr=[6,3,123,1,2412,44,41]; 
	
		SORT(arr);  /*方法调用*/

			for (var i = 0; i < arr.length; i++) {
				document.write("这个数是:"+arr[i]+"<br>");
			}	




function  SORT(arr){
		for (var i = 0; i < arr.length; i++) {
			for (var j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					var  temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
			}
		}

	}