//Criando variavéis para armazenar as divs... Para assim poder alterar entre as div criadas
const firstDiv = document.querySelector('.first-step'); 
const secondDiv = document.querySelector('.second-step');
const finalDiv = document.querySelector('.final-step');

//Alternar das divs
function go(atual, proximo) //Passo que estou, quero ir pra qual
{
    let displayNone, displayBlock;

    //Verificação
    if(atual == 1){
        displayNone = firstDiv;
    }
    else if(atual == 2){
        displayNone = secondDiv;

    }
    else{
        displayNone = finalDiv;
    }
    displayNone.style.display = 'none';

     if(proximo == 1){
        displayBlock = firstDiv;
    }
    else if(proximo == 2){
        displayBlock = secondDiv;

    }
    else{
        displayBlock = finalDiv;
    }
    displayBlock.style.display = 'block';
}

function validar()
{
    const peso = document.getElementById('peso');
    const altura = document.getElementById('altura');
    
    peso.style.border = 'none'; //Para quando iniciar
    altura.style.border = 'none';

    if(!peso.value || !altura.value) //Se eu não tiver peso ou não tiver altura
    {
        if(!peso.value && !altura.value) //Se eu não tiver peso e altura
        {
           peso.style.border = '2px solid red';
           altura.style.border = '2px solid red';
        }
        else if (!peso.value)
        {
            peso.style.border = '2px solid red';
        }
        else
        {
            altura.style.border = '2px solid red';
        }
    }
    else
    {
        let imc = peso.value / (altura.value * altura.value);
        const result = document.getElementById('resultado');
        if(imc < 18.5){
            console.log('Magraza | Obesidade: 0');
            result.style.color = 'yellow';
            result.innerHTML = 'Magreza | Obesidade 0';

        }
        else if(imc >= 18.5 && imc <= 24.9){
            console.log('Normal | Obesidade: 0');
            result.style.color = 'green';
            result.innerHTML = 'Normal | Obesidade: 0';
        }
        else if (imc >= 24.9 && imc <= 29.9){
            console.log('Sobrepeso | Obesidade: 1');
            result.style.color = 'orange';
            result.innerHTML = 'Sobrepeso | Obesidade: 1';
        }
        else if (imc >= 30 && imc <= 39.9){
            console.log('Obesidade | Obesidade: 2');
            result.style.color = 'red';
            result.innerHTML = 'Obesidade | Obesidade: 2';
        }
        else {
            console.log('Obesidade Grave | Obesidade: 3');
            result.style.color = 'black';
            result.innerHTML = 'Obesidade Grave | Obesidade: 3';
        }
        go(2,3);
    }
}


