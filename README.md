# Benchmark-de-performances-des-Web-Services-REST

Cette étude compare trois approches d’exposition d’API sous Spring Boot : **Jersey**, **@RestController** et **Spring Data REST**.  
L’expérimentation a porté sur plusieurs scénarios types : **READ-heavy**, **JOIN-filter**, **MIXED** et **HEAVY-body**, afin de mesurer la **latence (p50/p95/p99)**, le **débit (RPS)** et le **taux d’erreur** pour chaque approche.  
Les tests ont été réalisés sur des endpoints critiques (`/items`, `/categories`, etc.), combinant des opérations de lecture et d’écriture.  
Les résultats montrent que **@RestController** offre le meilleur débit et la plus faible latence, tandis que **Jersey** reste plus stable et **Spring Data REST** plus lent.

---

## Tests JMeter

### READ-heavy
<p align="center">
  <b>Variante A</b><br>
  <img width="1521" height="853" alt="Capture4READHEAVYvarA" src="https://github.com/user-attachments/assets/5947e1df-f239-4ebe-b362-d87d89a0e2b0" />
  &nbsp;&nbsp;&nbsp;
  <b>Variante B</b><br>
  <img width="975" height="550" alt="image" src="https://github.com/user-attachments/assets/c7e20df9-64f0-45df-9aae-bb2f42a6b3e0" />
</p>

---

### JOIN-filter
<p align="center">
  <b>Variante A</b><br>
  <img width="1512" height="859" alt="Capture3JOIN VARA" src="https://github.com/user-attachments/assets/033d097f-34dc-4460-a9e4-dfffcc3975cc" />
  &nbsp;&nbsp;&nbsp;
  <b>Variante B</b><br>
  <img width="975" height="548" alt="image" src="https://github.com/user-attachments/assets/37b87097-bed4-4428-af4f-6cdeb8e58cd4" />
</p>

---

### MIXED
<p align="center">
  <b>Variante B</b><br>
  <img width="1862" height="886" alt="Capture7MIXEDVarA" src="https://github.com/user-attachments/assets/4841e7db-6449-4db6-8d0b-2af8e40158be" />
  &nbsp;&nbsp;&nbsp;
  <b>Variante C</b><br>
  <img width="1920" height="719" alt="Capture10MIXEDvarc" src="https://github.com/user-attachments/assets/d00366a2-8a04-4d68-89d6-4ef5b5266a50" />
</p>

---

### HEAVY-body
<p align="center">
  <b>Variante A</b><br>
  <img width="1920" height="950" alt="Capture5RDHEAVYcount" src="https://github.com/user-attachments/assets/b1536615-af92-4cc9-937b-b9c3ea5dcf8e" />
  &nbsp;&nbsp;&nbsp;
  <b>Variante B</b><br>
  <img width="1920" height="993" alt="Capture8ReadHEAVYvarB" src="https://github.com/user-attachments/assets/b921adf0-0db7-48db-8a2d-12f689202824" />
</p>

---

## Dashboards Grafana

### READ-heavy
<p align="center">
  <b>Variante A</b><br>
  <img width="1920" height="950" alt="Capture5RDHEAVYcount" src="https://github.com/user-attachments/assets/b1536615-af92-4cc9-937b-b9c3ea5dcf8e" />
  &nbsp;&nbsp;&nbsp;
  <b>Variante B</b><br>
  <img width="1920" height="993" alt="Capture8ReadHEAVYvarB" src="https://github.com/user-attachments/assets/b921adf0-0db7-48db-8a2d-12f689202824" />
</p>

---

### JOIN-filter
<p align="center">
  <b>Variante A</b><br>
  <img width="1920" height="1014" alt="Capture2COUNT" src="https://github.com/user-attachments/assets/4d914652-c5a6-49c2-b67e-bb4941c5c8b7" />
  &nbsp;&nbsp;&nbsp;
  <b>Variante C</b><br>
  <img width="1916" height="593" alt="Capture9JOINVarc" src="https://github.com/user-attachments/assets/114f69af-53b7-41d2-9da5-27e85057dca5" />
</p>

---

### MIXED
<p align="center">
  <b>Variante B</b><br>
  <img width="1862" height="886" alt="Capture7MIXEDVarA" src="https://github.com/user-attachments/assets/4841e7db-6449-4db6-8d0b-2af8e40158be" />
  &nbsp;&nbsp;&nbsp;
  <b>Variante C</b><br>
  <img width="1920" height="719" alt="Capture10MIXEDvarc" src="https://github.com/user-attachments/assets/d00366a2-8a04-4d68-89d6-4ef5b5266a50" />
</p>

---

### HEAVY-body
<p align="center">
  <b>Variante A</b><br>
  <img width="1920" height="950" alt="Capture5RDHEAVYcount" src="https://github.com/user-attachments/assets/b1536615-af92-4cc9-937b-b9c3ea5dcf8e" />
  &nbsp;&nbsp;&nbsp;
  <b>Variante B</b><br>
  <img width="1920" height="993" alt="Capture8ReadHEAVYvarB" src="https://github.com/user-attachments/assets/b921adf0-0db7-48db-8a2d-12f689202824" />
</p>
