/**
 * 
 */



function component(){
   
   var element=document.createElement('div');
   var button =document.createElement('button');
   var br=document.createElement('br');
   button.innerHTML='Click me';
   element.innerHTML=_.join(['ABC','D'],' ');
   element.appendChild(br);
   element.appendChild(button);
   button.onclick=e=>import('./print.js').then(module =>{
       var print=module.default;
       print();
   });
   return element;
    
}
document.body.appendChild(component());