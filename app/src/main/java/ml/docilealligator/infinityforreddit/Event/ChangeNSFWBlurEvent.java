package ml.docilealligator.infinityforreddit.Event;

public class ChangeNSFWBlurEvent {
    public boolean needBlurNSFW;

    public ChangeNSFWBlurEvent(boolean needBlurNSFW) {
        this.needBlurNSFW = needBlurNSFW;
    }
}
