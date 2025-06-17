# Solicita o primeiro número e inicializa o maior com ele
num = int(input("Digite 5 números: "))
maior = num

# Laço para ler os próximos 4 números
for cont in range(1, 5):
    num = int(input())

    # Atualiza o maior se o número atual for maior
    if num > maior:
        maior = num

# Exibe o maior valor digitado
print("Maior valor =", maior)
