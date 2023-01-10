package gachijyanken.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RuleTests {

    @Test
    void 勝敗を決めるテスト() {
        var rule = new Rule();
        var player = new Player();
        player.パーを出す();
        var cpu = new Cpu();
        cpu.グーを出す();
        var result = rule.勝敗を決める(player, cpu);
        assertEquals(result, 勝敗.勝利);
    }
}
