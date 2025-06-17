# Solicita o salário do usuário
sal = float(input("Digite seu salário: "))

# Verifica se o salário é maior que 2500 (limite para isenção)
if sal > 2500:

    # Faixa de imposto de 7,5%
    if sal <= 3500:
        print("Seu imposto de renda é de 7,5%.")

    # Faixa de imposto de 15%
    elif sal > 3500 and sal <= 4500:
        print("Seu imposto é de 15%.")

    # Faixa de imposto de 22,5%
    elif sal > 4500 and sal <= 5500:
        print("Seu imposto de renda é de 22,5%.")

    # Acima de 5500, imposto de 27,5%
    else:
        print("Seu imposto de renda é de 27,5%")

# Para salários até 2500, isento de imposto
else:
    print("Você está isento do imposto de renda.")
