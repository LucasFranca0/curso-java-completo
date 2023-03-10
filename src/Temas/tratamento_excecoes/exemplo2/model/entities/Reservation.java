package Temas.tratamento_excecoes.exemplo2.model.entities;

import Temas.tratamento_excecoes.exemplo2.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

// tratamento de exceções
// Solução 1 - Muito Ruim
public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    // Lançando exceção no construtor e propagando uma exceção throws DomainException
    // para exceção do tipo explicita inserir o "throws DomainException"
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut)  {
        Date now = new Date();
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        if (checkIn.before(now)) {
            throw new DomainException("Reservation dates must be future");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    // Lançando exceção e propagando
    public void updateDate(Date checkIn, Date checkOut)  {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
         //Instanciando uma exceção e passando uma mensagem
            throw new DomainException("Reservation dates for update must be future");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", " + duration() + " nights";
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }

}
