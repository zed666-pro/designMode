package principle.interfaceSegregation.after;

/**
 * @description: 一个Door类，这个中只有防水和防噪音的功能
 * @author: shengaojie
 * @email: xxx@xx.com
 * @date: 2023/2/10 21:56
 */


public class ShengaojieDoor implements SoundProof, WaterProof {
    @Override
    public void proofSound() {

    }

    @Override
    public void waterProof() {

    }
}
