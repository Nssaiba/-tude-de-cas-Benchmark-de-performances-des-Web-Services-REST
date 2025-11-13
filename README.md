# Benchmark de performances des Web Services REST

Cette étude compare trois approches d’exposition d’API sous **Spring Boot** :  
**Jersey**, **@RestController** et **Spring Data REST**.

L’expérimentation a porté sur plusieurs scénarios types :  
**READ-heavy**, **JOIN-filter**, **MIXED** et **HEAVY-body**, afin de mesurer la **latence** (*p50/p95/p99*), le **débit (RPS)** et le **taux d’erreur** pour chaque approche.

Les tests ont été réalisés sur des endpoints critiques (`/items`, `/categories`, etc.), combinant des opérations de lecture et d’écriture afin d’obtenir une vision complète des performances.

Les mesures montrent que :
- **@RestController** offre le meilleur débit et la plus faible latence.  
- **Jersey** reste plus stable.  
- **Spring Data REST** est plus lent.

---

## ⚙️ Tests JMeter

### 🔹 READ-heavy
<img width="1521" height="853" alt="Capture4READHEAVYvarA" src="https://github.com/user-attachments/assets/5947e1df-f239-4ebe-b362-d87d89a0e2b0" />

<img width="975" height="550" alt="image" src="https://github.com/user-attachments/assets/c7e20df9-64f0-45df-9aae-bb2f42a6b3e0" />

---

### 🔹 JOIN-filter
<img width="1512" height="859" alt="Capture3JOIN VARA" src="https://github.com/user-attachments/assets/033d097f-34dc-4460-a9e4-dfffcc3975cc" />

<img width="975" height="548" alt="image" src="https://github.com/user-attachments/assets/37b87097-bed4-4428-af4f-6cdeb8e58cd4" />

---

### 🔹 MIXED
<img width="1520" height="819" alt="image" src="https://github.com/user-attachments/assets/43970a12-a065-47f2-b1c2-bf8770f732b0" />

<img width="975" height="550" alt="image" src="https://github.com/user-attachments/assets/f19f5352-3f27-424c-9603-d9ce89d39628" />

---

### 🔹 HEAVY-body
<img width="1631" height="859" alt="image" src="https://github.com/user-attachments/assets/d41770f6-b923-466a-aa82-95aafda9b601" />

---

## 📈 Dashboards Grafana

### 🔹 READ-heavy 

**Variante A :**  
<img width="1920" height="950" alt="Capture5RDHEAVYcount" src="https://github.com/user-attachments/assets/b1536615-af92-4cc9-937b-b9c3ea5dcf8e" />

**Variante C :**  
<img width="1920" height="993" alt="Capture8ReadHEAVYvarB" src="https://github.com/user-attachments/assets/b921adf0-0db7-48db-8a2d-12f689202824" />

**Variante D :**  
<img width="1904" height="694" alt="image" src="https://github.com/user-attachments/assets/8cb8ab37-be1c-49ff-adb1-efde1c8c7c4c" />

---

### 🔹 JOIN-filter

**Variante A :**  
<img width="1920" height="1014" alt="Capture2COUNT" src="https://github.com/user-attachments/assets/4d914652-c5a6-49c2-b67e-bb4941c5c8b7" />

**Variante C :**  
<img width="1916" height="593" alt="Capture9JOINVarc" src="https://github.com/user-attachments/assets/114f69af-53b7-41d2-9da5-27e85057dca5" />

**Variante D :**  
<img width="1912" height="709" alt="image" src="https://github.com/user-attachments/assets/1de023de-d103-4a39-bb57-892dff5e0fac" />

---

### 🔹 MIXED

**Variante A :**  
<img width="1862" height="886" alt="Capture7MIXEDVarA" src="https://github.com/user-attachments/assets/4841e7db-6449-4db6-8d0b-2af8e40158be" />

**Variante C :**  
<img width="1920" height="719" alt="Capture10MIXEDvarc" src="https://github.com/user-attachments/assets/d00366a2-8a04-4d68-89d6-4ef5b5266a50" />

**Variante D :**  
<img width="1920" height="593" alt="image" src="https://github.com/user-attachments/assets/317eccb2-c312-488c-a80e-926f8048367f" />

---

## 🧭 Interface web d’InfluxDB

<img width="1920" height="998" alt="image" src="https://github.com/user-attachments/assets/c73e9e28-71bf-4821-926d-ea45c91476c9" />
