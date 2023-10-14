function buttonClick(val)
{
    document.getElementById("screen").value=document.getElementById("screen").value+val;
}
function screenClear()
{
    document.getElementById("screen").value="";
}
function buttonEqual()
{
    var text=document.getElementById("screen").value;
    var result=eval(text);
    document.getElementById("screen").value=result;
   
}
function textBack()
{
    var text=document.getElementById("screen").value;
    if(text.length>0)
    {
        res=text.slice(0,-1);
        document.getElementById("screen").value=res;
    }
    
}