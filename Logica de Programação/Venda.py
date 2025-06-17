venda = float(input("Digite o valor da venda: "))

if venda >= 300:
    desconto = float(input("Digite o avalor do desconto: "))
    val_final = venda - (venda * (desconto/100))
    print(f"O valor final da sua compra é de R${val_final}")

else:
    print(f"O valor final de sua compra é de R${venda}")