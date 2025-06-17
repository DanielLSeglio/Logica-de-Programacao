sal = float(input("Digite o seu salario: "))
tc = int(input("Quantos anos na empresa: "))

if tc < 3:
    aumento = sal * (5/100)

else:
    aumento = sal * (10/100)

novo_sal = sal + aumento
print(f"Seu novo salario é de R${novo_sal}")