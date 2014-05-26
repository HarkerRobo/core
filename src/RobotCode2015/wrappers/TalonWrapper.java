package RobotCode2015.wrappers;

import edu.wpi.first.wpilibj.Talon;

/**
 *
 * @author atierno
 */
public class TalonWrapper extends Talon{
    
    private boolean isReversed = false;
    
    /**
     * Initializes a TalonWrapper with its channel.
     * @param channel The PWM channel on the digital module the Talon is attached to.
     */
    public TalonWrapper (int channel) {
        super(channel);
    }
    
    /**
     * Initializes a TalonWrapper with its channel and reversed flag.
     * @param channel The PWM channel on the digital module the Talon is attached to.
     * @param isReversed Whether or not the output of this Talon should be flipped.
     */
    public TalonWrapper (int channel, boolean isReversed) {
        super(channel);
        this.isReversed = isReversed;
    }
    
    /**
     * Initializes a TalonWrapper with its channel and slot.
     * @param channel The PWM channel on the digital module the Talon is attached to.
     * @param slot The slot on the chassis the digital module is plugged into.
     */
    public TalonWrapper (int channel, int slot) {
        super(slot, channel);
    }
    
    /**
     * Initializes a TalonWrapper with its channel, slot, and reversed flag
     * @param channel The PWM channel on the digital module the Talon is attached to.
     * @param slot The slot on the chassis the digital module is plugged into.
     * @param isReversed Whether or not the output of this Talon should be flipped.
     */
    public TalonWrapper (int channel, int slot, boolean isReversed) {
        super(slot, channel);
        this.isReversed = isReversed;
    }
    
    /**
     * Sets the speed of the Talon (handles reversing).
     * @param speed The speed to set the Talon.
     */
    public void set (double speed) {
        super.set(isReversed ? -speed : speed);
    }
    
    /**
     * Sets the reversed flag of the Talon.
     * @param flag Set whether or not to reverse the Talon output.
     */
    public void setReversed (boolean flag) {
        isReversed = flag;
    }
    
    /**
     * Gets the reversed flag of the Talon.
     * @return Whether or not the Talon output is reversed
     */
    public boolean getReversed () {
        return isReversed;
    }
}
