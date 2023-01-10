package gachijyanken.domain;

public class Rule {

    勝敗 勝敗を決める(Player player, Cpu cpu) {
        if (player.hand.equals(cpu.hand)) return 勝敗.あいこ;
        if (player.hand.equals(Hand.グー) && cpu.hand.equals(Hand.チョキ)) return 勝敗.勝利;
        if (player.hand.equals(Hand.グー) && cpu.hand.equals(Hand.パー)) return 勝敗.敗北;
        if (player.hand.equals(Hand.チョキ) && cpu.hand.equals(Hand.グー)) return 勝敗.敗北;
        if (player.hand.equals(Hand.チョキ) && cpu.hand.equals(Hand.パー)) return 勝敗.勝利;
        if (player.hand.equals(Hand.パー) && cpu.hand.equals(Hand.グー)) return 勝敗.勝利;
        if (player.hand.equals(Hand.パー) && cpu.hand.equals(Hand.チョキ)) return 勝敗.敗北;
        throw new RuntimeException("ルールに存在しない");
    }
}
