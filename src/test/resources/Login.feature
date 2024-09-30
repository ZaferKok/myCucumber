Feature: Login islemi

  Background:
    Given login sayfasi

  @ucuncu
  Scenario Outline: ayni sayfada hem Scenario hem de Scenario Outline kullanabiliriz
    When kullanici adi girilir "<kullaniciAdi>"
    And kulllanici sifresi girilir "<sifre>"
    Then login buton tiklanir
    Examples:
    | username  | password |
    | erdemTatli123 | 54ab21|
    | yusufOlmez    | 36ab21|
