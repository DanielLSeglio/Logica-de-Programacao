valor = float(input("Digite um valor: "))
porcentagem = float(input("Digite ao valor da porcentagem: "))

percentual = valor * (porcentagem/100)
print("O percentual é de: ", percentual)

acrescimo = valor + percentual
print("Com o acrescimo fica: ", acrescimo)

desconto = valor - percentual
print("Com o desconto fica: ", desconto)