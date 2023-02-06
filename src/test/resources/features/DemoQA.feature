@Demo_QA
Feature: US1017 explicitly wait kullanimi

  @Demo_QA_1
  Scenario: TC24 ilgili bekleme islemlerinin yapilmasi

    Given kullanici "demoqaUrl" anasayfasina
    And Elements butonuna tiklar
    And kullanici 1 sn bekler
    Then Dynamic Properties'e tiklar
    And kullanici 1 sn bekler
    And Will enable five seconds butonuna tiklar
    Then Will enable five seconds butonunun enable oldugunu test eder
    And sayfayi kapatir

  @Demo_QA_2
  Scenario:TC23 ilgili allertionlari kapatma
    Given kullanici "demoqaUrl" anasayfasina
    And Alerts,Frame,Windows butonuna tiklar
    And kullanici 1 sn bekler
    And Alerts'e tiklar
    And kullanici 2 sn bekler
    And On button click, alert will appear after five seconds karsisindaki click me butonuna basar
    And Allert'in gorunur olmasini bekleyin
    Then Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test edin
    And Ok yazisina tiklayarak alerti kapatin
    And sayfayi kapatir


    #demoqaUrl=https://demoqa.com/



