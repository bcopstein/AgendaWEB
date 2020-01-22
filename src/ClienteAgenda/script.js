

// Consulta dados contato
async function consultaDados(umNome, umSobrenome) {
    console.log(umNome+", "+umSobrenome);

    let url = "http://localhost:8080/agendaweb/recuperaPorNomeSobrenome";
    url = url + "?nome="+umNome+"&sobreNome="+umSobrenome;

    try{
        let resposta = await fetch(url);
        console.log(resposta);
        if (resposta.ok){
            let dados = await resposta.json();
            console.log(dados);
            return dados;
        }else{
            console.log(resposta.status+", text="+resposta.statusText);
            return null;
        }
    }catch(erro){
        console.log(erro);
    }
}

// Consulta dados contato com post
async function consultaDadosPost(dados) {
    let url = "http://localhost:8080/agendaweb/recuperaPorNomeSobrenome";

    try{
        let resposta = await fetch(url,{
            method:"POST",
            headers:{
                'Content-Type': 'application/json'
            },
            body:JSON.stringify(dados)
        });
        console.log(resposta);
        if (resposta.ok){
            let dados = await resposta.json();
            console.log(dados);
            return dados;
        }else{
            console.log(resposta.status+", text="+resposta.statusText);
            return null;
        }
    }catch(erro){
        console.log(erro);
    }
}

// --- início do programa
document.getElementById("btGet").onclick = async function () {
    nome = document.getElementById("nome").value;
    sobrenome = document.getElementById("sobrenome").value;
    let resposta = await consultaDados(nome, sobrenome);
    let div = document.getElementById("resposta");
    if (resposta != null){
        div.innerHTML = JSON.stringify(resposta);
        jsonTest = document.getElementById("jsonTest");
        jsonTest.innerHTML = resposta.nome+"<br>"+resposta.sobrenome+"<br>"+resposta.telefone;
    }else{
        div.innerHTML = "Erro";
    }
}

document.getElementById("btPost").onclick = async function () {
    umNome = document.getElementById("nome").value;
    umSobrenome = document.getElementById("sobrenome").value;
    let dados = {
        nome:umNome,
        sobrenome:umSobrenome
    };

    let resposta = await consultaDadosPost(dados);
    let div = document.getElementById("resposta");
    if (resposta != null){
        div.innerHTML = JSON.stringify(resposta);
        jsonTest = document.getElementById("jsonTest");
        jsonTest.innerHTML = resposta.nome+"<br>"+resposta.sobrenome+"<br>"+resposta.telefone;
    }else{
        div.innerHTML = "Erro";
    }
}
