/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stu
 */
public class Note {
    private int start;
    private int end;
    private int pitch;
    private int velocity;

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public Note(int start, int end, int pitch, int velocity) {
        this.start = start;
        this.end = end;
        this.pitch = pitch;
        this.velocity = velocity;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setPitch(int pitch) {
        this.pitch = pitch;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getPitch() {
        return pitch;
    }

    public int getEnd() {
        return end;
    }

    public Note(int start, int end, int pitch) {
        this.start = start;
        this.end = end;
        this.pitch = pitch;
    }

    public Note() {
    }
}
