Atividade que teve base a oitava lista de atividades do Flowgorithm, usando o do while, tentei fazer o máximo das atividades com mais complexidade, mas devido a data limite, tive que "rushar" o final.

Lista de Exercícios: Algoritmos e Indústria 4.0
Bloco 1: Monitoramento e Sensores

Leitura de Temperatura: Crie um algoritmo que leia a temperatura de uma
extrusora. O programa deve repetir a leitura "Enquanto" a temperatura for
inferior a 180°C.

Calibração de Pressão: O sistema deve solicitar a pressão de uma caldeira. Se
a pressão for menor que 10 bar, peça nova leitura. Pare quando atingir o nível
ideal.

Contagem de Peças: Um sensor óptico conta peças em uma esteira. O
algoritmo deve somar 1 a uma variável total a cada ciclo do "Faça Enquanto"
até chegar a 50 peças.

Nível de Reservatório: Leia o nível de um tanque de óleo (0 a 100%). Enquanto
o nível for menor que 80%, o algoritmo deve exibir "Enchendo..." e pedir nova
leitura.

Umidade do Ar: Em um ambiente de pintura, a umidade deve estar entre 40% e
60%. O programa deve repetir a leitura se o valor estiver fora dessa faixa,
alertando "Ambiente Inadequado".

Bloco 2: Segurança e Acesso

Login de Operador: Solicite o nome do usuário. Enquanto a String for diferente
de "ADMIN", repita a solicitação de acesso.

Senha de Segurança: Crie um sistema que peça uma senha numérica. O ciclo
deve rodar enquanto a senha for diferente de 1234.

Botão de Emergência: O algoritmo simula o status de um botão (0 para OK, 1
para EMERGÊNCIA). Enquanto o valor for 0, o sistema exibe "Operação Normal".
Se for 1, o laço encerra.

Validação de Crachá: O sistema deve ler o prefixo de um crachá (String). Se não
começar com "SENAI-", peça para ler novamente.

Bloco 3: Cálculos e Produção

Média de Produção: Peça a quantidade de peças produzidas em 5 turnos. Use
o "Faça Enquanto" para garantir que o instrutor digite exatamente 5 valores,
calcule a média ao final.

Consumo Energético: Leia o consumo em kWh de uma máquina. Enquanto o
acumulado for menor que 500 kWh, continue somando novos valores
informados.

Descarte de Refugo: O algoritmo deve perguntar se a peça produzida está "OK"
ou "DEFEITO". Enquanto o total de defeitos for menor que 5, a produção
continua.

Cálculo de Eficiência (OEE): Peça o tempo total de máquina ligada e o tempo
produzindo. Calcule a disponibilidade (Produção / Total). Repita o processo
para 3 máquinas diferentes.

Bloco 4: Logística e Manutenção

Peso de Carga (AGV): Um veículo autônomo suporta 1000kg. Vá somando o
peso das caixas inseridas até que o limite seja atingido ou ultrapassado.

Horas de Voo (Drones de Inspeção): Um drone precisa de manutenção a cada
20 horas. Vá somando as horas de cada missão até atingir o limite de
manutenção.

Estoque de Insumos: Comece com 100 unidades de matéria-prima. A cada
ciclo, subtraia uma quantidade usada. Pare quando o estoque for menor que 10.

lerta de Manutenção Preventiva: Peça a data da última manutenção (dia).
Enquanto o dia for menor que 1 e maior que 31 (validação), peça para repetir a
digitação.

Bloco 5: Integração e Lógica Avançada

Simulador de Leilão de Peças: Peças customizadas recebem lances. Enquanto
o lance atual for menor que o preço de reserva (ex: 50.0), continue pedindo
novos lances.

Controle de Rotação (RPM): Aumente a rotação de um motor de 500 em 500
RPM usando uma expressão de soma dentro do laço, até que atinja 3000 RPM.

Relatório Final: Use a lógica do exercício 3 e 12. Ao final do turno (quando
atingir 50 peças), mostre o total de peças boas e o total de refugos, calculando a
porcentagem de perda.
