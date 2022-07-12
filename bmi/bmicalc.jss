// This function clear all the values
function clearScreen() {
    document.getElementById("result").value = "";
}


function calculate(){
    //geting i/p from user
    var result = document.getElementById("result");
     height = parseInt(document.getElementById("height").value);
     weight = parseInt(document.getElementById("weight").value);
     let h1 = height/100;
     if (weight>1 && height >54){
    let bmi = weight / (h1*h1);
    result.textContent = bmi;

    // categorizing bmi according to their values
    if (bmi<=18.40)
     { category ="under-weight";
     }
    if (bmi>=18.5 && bmi<=24.9) { 
        category = "normal";
    }
    if (bmi>=25 && bmi<=39.9) { 
        category = "overweight";
    }
    if (bmi>=40) { 
        category ="obese";
   }
    document.getElementById("category").textContent = category;
}
else result.textContent = "invalid parameters";
}
