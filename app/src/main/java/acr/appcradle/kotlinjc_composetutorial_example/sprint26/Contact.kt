package acr.appcradle.kotlinjc_composetutorial_example.sprint26

import acr.appcradle.kotlinjc_composetutorial_example.R

data class Contact(
    val name: String, //Имя
    val surname: String? = null, //Отчество
    val familyName: String, //Фамилия
    val imageRes: Int? = null,//Ресурс фотографии
    val isFavorite: Boolean = false,//Признак избранного контакта
    val phone: String, //Телефон
    val address: String, //Адрес
    val email: String? = null, //E-mail
)

val contact1 = Contact(
    name = "Евгений",
    surname = "Андреевич",
    familyName = "Лукашин",
    imageRes = null,
    isFavorite = true,
    phone = "+7 999 993 83 83",
    address = "г. Москва, 3-я улица Строителейб д.25, кв.12",
    email = "lukashin@email.com"
)
val contact2 = Contact(
    name = "Василий",
    surname = null,
    familyName = "Кузякин",
    imageRes = R.drawable.avatar,
    isFavorite = false,
    phone = "--",
    address = "Ивановская область, дер. Крутово, д.4",
    email = null
)