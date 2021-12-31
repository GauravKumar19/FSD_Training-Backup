package com.coforge.training.springweb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



import com.coforge.training.springweb.model.Reservation;



@Controller
public class ReservationController {



@RequestMapping("/bookingForm")
public String showFormForReservation(Model theModel)
{
Reservation res = new Reservation();
theModel.addAttribute("reservation", res);
return "reservationPage"; //it has reservation object
}
@RequestMapping("/submitForm")
public String submitForm(@ModelAttribute("reservation") Reservation res) {

return "confirmationForm"; // It has res as a object of reservation
}
}