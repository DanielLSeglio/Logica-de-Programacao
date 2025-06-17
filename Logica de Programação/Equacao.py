import math  # Importa o módulo math para funções matemáticas

# Solicita um número inteiro ao usuário
n1 = int(input('Insira um valor: '))

# Calcula a raiz quadrada usando potência (exponenciação)
raiz_quadrada = n1 ** (1/2)
print(raiz_quadrada)

# Calcula a raiz quadrada usando a função sqrt() do módulo math
metodo_2 = math.sqrt(n1)
print(metodo_2)
