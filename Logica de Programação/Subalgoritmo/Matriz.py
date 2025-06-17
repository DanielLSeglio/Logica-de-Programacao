# Cria uma matriz 4x2 inicializada com zeros
matriz = [[0, 0], [0, 0], [0, 0], [0, 0]]

print("Preenchendo a matriz...")
# Loop para preencher a matriz com valores informados pelo usuário
for l in range(4):  # Percorre as linhas (0 a 3)
    for c in range(2):  # Percorre as colunas (0 a 1)
        matriz[l][c] = float(input(f"Matriz [{l}] e [{c}]: "))  # Lê um valor float e armazena na posição [l][c]

# Exibe a matriz no formato de tabela
for l in range(4):
    for c in range(2):
        print(f"{matriz[l][c]}\t", end="")  # Exibe o valor seguido de uma tabulação
    print()  # Quebra de linha após cada linha da matriz

# Inicializa a variável soma
soma = 0
# Loop para calcular a soma de todos os elementos da matriz
for l in range(4):
    for c in range(2):
        soma += matriz[l][c]  # Soma acumulando os valores

# Exibe a soma total dos elementos da matriz
print("\nSoma = ", soma)
