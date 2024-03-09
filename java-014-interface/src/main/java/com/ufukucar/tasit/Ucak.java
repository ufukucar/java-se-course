package com.ufukucar.tasit;

import com.ufukucar.kurallar.HavacilikDernegi;
import com.ufukucar.kurallar.Kanun;
import com.ufukucar.base.Arac;
import lombok.*;


@Setter @Getter
@NoArgsConstructor
@ToString(callSuper = true)

public class Ucak  extends Arac implements Kanun, HavacilikDernegi {
    @Override
    public int hisSiniri() {
        return 35_000;
    }

    @Override
    public String bakimDurumu() {
        return "Haftalık";
    }

    @Override
    public int tasitVerigis() {
        return 18_000;
    }

    @Override
    public Boolean dernekUyeDurumu() {
        return true;
    }

    @Override
    public int aidat() {
        return 2_000;
    }
}
