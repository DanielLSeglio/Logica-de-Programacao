def repetir():
    return str(input("Digite [S] para sim ou [N] para não: ")).strip().upper()

opcao = repetir()


while opcao != 'S' and opcao != 'N':
    print("Voce digitou ", opcao, "digite [S] ou [N]: " )
    opcao = repetir()

print(f"Voce digitou {opcao}")