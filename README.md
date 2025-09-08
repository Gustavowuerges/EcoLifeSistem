# EcoLifeSim
um sistema que simula um pequeno ecossistema com diferentes tipos de seres vivos (plantas, herbívoros, carnívoros, etc.), que interagem entre si em um ambiente virtual..

//

# Funcionalidades desejadas:

## Seres vivos com comportamento dinâmico:
Devem envelhecer, gastar energia e agir de forma autônoma a cada "ciclo"
Cada ser deve agir de forma diferente (ex: planta faz fotossíntese, herbívoros procuram plantas, carnívoros caçam herbívoros)
Devem existir pelo menos 3 tipos de seres vivos: Planta, Herbívoro, Carnívoro
Os herbívoros e plantas devem poder ser comidos, fornecendo energia ao predador
Seres vivos morrem se a energia chegar a 0 ou se atingirem idade máxima
Ao final de cada ciclo, queremos um resumo com o número de seres vivos restantes por tipo
A simulação deve rodar em ciclos (ex: 10 dias), controlados por uma classe Ambiente

## Requisitos técnicos:
- Código em Java
- Uso adequado de POO (herança, composição, interfaces, encapsulamento)
- Código limpo e organizado
- Nenhuma interface gráfica necessária por enquanto
- Regras de reprodução entre seres vivos
- Influência de tipos de ambiente (deserto, floresta, etc.)
- Sistema de logs no console: quem comeu quem, quem morreu, etc.
