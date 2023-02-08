## Problema do diamante

A herança múltipla pode gerar o problema do diamante: uma ambiguidade causada pela existência do mesmo método em mais de uma superclasse.
<br><br>Herança múltipla não é permitida na maioria das linguagens!

OBS: E também não é permitida no Java.


### Porém, uma classe pode implementar mais de uma 'interface', como mostra o exemplo do código

**ATENÇÃO:**
Isso **NÃO** é herança múltipla, pois **NÃO HÁ REUSO** na relação entre ComboDevice e asinterfaces Scanner e 'Printer'.
ComboDevide não herda, massim implementa as 'interfaces'(cumpre o contrato).