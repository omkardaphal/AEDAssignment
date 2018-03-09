/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

/**
 *
 * @author MAC
 */
class Seat {

    private boolean filled;
    private SeatAssignment seatAssignment;

    public Seat(boolean filled, SeatAssignment seatAssignment) {
        setFilled(filled);
        setSeatAssignment(seatAssignment);
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public SeatAssignment getSeatAssignment() {
        return seatAssignment;
    }

    public void setSeatAssignment(SeatAssignment seatAssignment) {
        this.seatAssignment = seatAssignment;
    }

}
