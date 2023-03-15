# DADOS PRIMITIVOS

- Aceita pouca quantidade numérica, do -128 ao 127;
- São aceitos apenas números inteiros;
- Ótima opção de facilidade para armazenar dados;
- Seu tamanho é igual a 8 bits ou 1 bytes, mas na memória da máquina;
- É possível utilizá-lo em operações com números pequenos;
- Da mesma forma que o "short", em suas operações, pode ocorrer erro, causado por cálculos entre variáveis "bytes" resultar em variáves do tipo "int", e para resolver este problema, é necessário transformar o resultado em "byte" novamente, como no exemplo abaixo:
Ex: número byte = 10; nome byte = 5; nim byte = (byte)(num + nom);
