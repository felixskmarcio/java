
````python
# Classes e métodos: Um método pode chamar ele mesmo. Chamamos isso de recursão. Você pode resolver a série de Fibonacci usando um método que chama ele mesmo. O objetivo é você criar uma classe, que possa ser usada da seguinte maneira: Fibonacci fibonacci = new Fibonacci(); for (int i = 1; i <= 6; i++) { int resultado = fibonacci.calculaFibonacci(i); System.out.println(resultado);} Aqui imprimirá a sequência de Fibonacci até a sexta posição, isto é: 1, 1, 2, 3, 5, 8.
````

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
