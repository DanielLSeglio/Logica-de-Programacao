# Cria uma lista heterogênea com diferentes tipos de dados
lista = ["a", 1, 7, 2, True, 4.5]
print(lista)  # Exibe a lista inicial

# Adiciona o valor 45 no final da lista
lista.append(45)
print(lista)

# Insere o valor 56 na posição 0 (início da lista)
lista.insert(0, 56)
print(lista)

# Remove o último elemento da lista
lista.pop()
print(lista)

# Remove o elemento que está na penúltima posição (índice -3)
lista.pop(-3)
print(lista)

# Limpa todos os elementos da lista, deixando-a vazia
lista.clear()

# Loop que roda 5 vezes para adicionar números informados pelo usuário na lista
for cont in range(0, 5, 1):
    x = float(input("Digite um numero: "))  # Lê um número (float) do usuário
    lista.append(x)  # Adiciona esse número na lista
    print(lista)  # Mostra a lista atualizada a cada iteração

"""
# Este bloco está comentado, mas ele serviria para exibir os elementos da lista 
# usando acesso por índice.
for i in range(0, 5, 1):
    print(lista[i])
"""

# Percorre a lista exibindo cada elemento diretamente, sem usar índices
for elem in lista:
    print(elem)

# Calcula a soma dos elementos da lista
soma = 0
for elem in lista:
    soma += elem
print("\nsoma = ", soma)
