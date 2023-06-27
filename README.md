# lecture-cache-content
Repo com dados referentes a palestra de Cache.

A aplicação possui 2 endpoints para retornar uma página de produto.
Um sem cache (v1) e outro com cache (v2).

Objetivo principal ẽ comparar o tempo gasto da mesma operação usando cache x não uso do cache.

O cache utilizado foi o [caffeine](https://github.com/ben-manes/caffeine).


## Documentação da API

A documentação da api pode ser utilizada para também fazer request.

http://localhost:8080/swagger-ui/index.html

## Scripts

O diretório _scripts_ possui alguns arquivos para ajudar no teste.

- request_no_cache.sh: Request para o endpoint que não tem cache
- request with_cache.sh: Request para o endpoint que tem cache
- start_app.sh: Inicia a aplicação, utilizando o plugin do maven
- start_compile_app.sh: Compila e inicia a aplicação

## Requisitos

Java 17
Maven

# Iniciar a aplicação
./scripts/start_compile_app.sh

A aplicação roda por padrão na porta 8080.

## Como utilizar

Os scripts de request, chamam a api utilizando chaves aleatórias.

O objetivo das chaves aleatórias é simular chaves que estarão ou não no cache.

No final do de cada request, e do fim de todos os requests, tem o tempo gasto da operação.

**Atenção:** O ideal para o teste seria executar isso de forma paralela, não sequencial como está no exemplo.
Para não colocar nenhuma ferramenta de teste de carga, utilizei request sequencial.

## Padrão do código
O código escrito foi focado na simplicidade, **não** considere ser a melhor configuração de _design_.

