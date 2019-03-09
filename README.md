# Warsztat wprowadzjący do Javy 8 - ćwiczenia
Celem warsztatu jest przećwiczenie strumieni Javy 8 na praktycznych przykładach. Należy zaimplementować metody w klasie 
WorkShop zgodnie z opisem jaki znajduje się w komentarzu do metody. Prawidłowo zaimplementowana metoda naprawi 
nie działający test w klasie WorkShopTest.
Jeżeli nie wiesz jak zaimplementować daną metodę, zostaw ją na później. Kolejność implementacji w większości przypadków 
nie ma znaczenia, chodź mogą się pojawić funkcje które wykorzystują funkcje implementowane w poprzednich testach. 
Zadania zostały tak ułożone żeby wymusić użycie wszystkich metod z interfejsu _Stream_. 

Ćwiczeń jest 40, testy do metod jakie należy zaimplementować znajdują się w _WorkShopTest_. Czas potrzebny na wykonanie 
ćwiczeń może się wahać od 2h do 6h. Po skończeniu ćwiczeń powinieneś umieć wykorzystać strumienie w prawdziwej 
aplikacji.

Podczas implementacji nie używamy pętli, if-ów, switchy oraz zmiennych (wystarczą stałe). 

## Wymagania
  - Podstawowa znajomość Javy 
  - JDK 1.8
  - Intellij z pluginem Lombok oraz włączonym przetwarzaniem adnotacji (_Enable annotation processing_)
  
## Zadania do wykonania

  1. Uruchom budowanie poprzez Gradle w celu ściągnięcia potrzebnych bibliotek
  1. Zaimplementuj wszystkie metody w klasie WorkShop, tak żeby działały testy jednostkowe w klasie 
  WorkShopTest
  1. Powtarzające sie fragmenty kodu umieść w osobnych metodach. 
  
## Struktura
Zadania bazują na wymyślonej strukturze 3 holdingów zawierającej firmy agregujące użytkowników. Każdy z użytkowników 
posiada takie dane jak imię, nazwisko, wiek praz listę rachunków oraz uprawnień. Przed rozpoczęciem ćwiczeń zapoznaj się
koniecznie z klasą odpowiedzialną za generowanie danych testowych - _HoldingMockGenerator_ oraz z klas przez nią 
wykorzystywanych. 

Uwaga: Dane użyte w mocku są losowe i nie zawsze mogą mieć sens. 