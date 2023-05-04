# GraphQL-API
Uma api de busca e cadastro em JAVA usando GraphQL

# Como usar:

É nescessário um banco de dados postgres com nome 'graph-db' disponivel para executar.
Baixe e execute o projeto usando o quarkus. 
Abra a URL http://localhost:8080/q/graphql-ui/ para ter acesso ao UI do GraphQL

# Queries:

mutation cadastrarCliente {  
&emsp;cadastrarCliente(clienteDTO: {  
&emsp;&emsp;nome: "novo cliente"  
&emsp;&emsp;hobbies: [  
&emsp;&emsp;&emsp;{nome: "hobbie"}  
&emsp;&emsp;&emsp;{nome: "outro hobbie"}  
&emsp;&emsp;]  
&emsp;})  
&emsp;{  
&emsp;&emsp; nome  
&emsp;}  
}  

query buscaClientePorId{  
&emsp;clienteById(clienteId: 1) {  
&emsp;&emsp;id  
&emsp;&emsp;nome  
&emsp;&emsp;hobbies{  
&emsp;&emsp;&emsp;id  
&emsp;&emsp;&emsp;nome  
&emsp;&emsp;}  
&emsp;}  
}  

query buscaTodos{  
&emsp;clientes{  
&emsp;&emsp;id  
&emsp;&emsp;nome  
&emsp;&emsp;hobbies{  
&emsp;&emsp;&emsp;id  
&emsp;&emsp;&emsp;nome  
&emsp;&emsp;}  
&emsp;}  
}
