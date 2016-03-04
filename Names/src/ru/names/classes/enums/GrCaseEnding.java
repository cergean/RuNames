/* 
 * Copyright (C) 2016 cergean
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ru.names.classes.enums;

import ru.names.classes.RythmicString;

/**
 *
 * @author cergean
 * Тип, определяющий окончание слова. Задает окончания для мужского и женского
 * варианта имени, фамилии и отчества. Не всегда соответствует морфологическому
 * окончанию слова.
 */
public enum GrCaseEnding {

    A_Acct_Ы_s_nom(Endings.A_ACCT, Endings.A_ACCT, new RythmicString("ин", "9"), new RythmicString("ина", "09"), new RythmicString("ич", "9"), new RythmicString("инична", "901")),
    A_Acct_Ы_s_gen(Endings.Ы_ACCT, Endings.Ы_ACCT, new RythmicString("ина", "09"), new RythmicString("иной", "09"), new RythmicString("ича", "90"), new RythmicString("иничны", "901")),
    A_Acct_Ы_s_dat(Endings.E_ACCT, Endings.E_ACCT, new RythmicString("ину", "09"), new RythmicString("иной", "09"), new RythmicString("ичу", "90"), new RythmicString("иничне", "901")),
    A_Acct_Ы_s_acc(Endings.U_ACCT, Endings.U_ACCT, new RythmicString("ина", "09"), new RythmicString("ину", "09"), new RythmicString("ича", "90"), new RythmicString("иничну", "901")),
    A_Acct_Ы_s_abl(Endings.OJ_ACCT, Endings.OJ_ACCT, new RythmicString("иным", "09"), new RythmicString("иной", "09"), new RythmicString("ичом", "90"), new RythmicString("иничной", "901")),
    A_Acct_Ы_s_pre(Endings.E_ACCT, Endings.E_ACCT, new RythmicString("ине", "09"), new RythmicString("иной", "09"), new RythmicString("иче", "90"), new RythmicString("иничне", "901")),
    A_Acct_Ы_p_nom(Endings.Ы_ACCT, Endings.Ы_ACCT, new RythmicString("ины", "09"), new RythmicString("ины", "09"), new RythmicString("ичи", "9"), new RythmicString("иничны", "901")),
    A_Acct_Ы_p_gen(Endings.EMP, Endings.EMP, new RythmicString("иных", "09"), new RythmicString("иных", "09"), new RythmicString("ичей", "90"), new RythmicString("иничн", "90")),
    A_Acct_Ы_p_dat(Endings.AM_ACCT, Endings.AM_ACCT, new RythmicString("иным", "09"), new RythmicString("иным", "09"), new RythmicString("ичам", "90"), new RythmicString("иничным", "901")),
    A_Acct_Ы_p_acc(Endings.EMP, Endings.EMP, new RythmicString("иных", "09"), new RythmicString("иных", "09"), new RythmicString("ичей", "90"), new RythmicString("иничн", "901")),
    A_Acct_Ы_p_abl(Endings.AMI_ACCT, Endings.AMI_ACCT, new RythmicString("иными", "090"), new RythmicString("иными", "090"), new RythmicString("ичами", "90"), new RythmicString("иничных", "901")),
    A_Acct_Ы_p_pre(Endings.AH_ACCT, Endings.AH_ACCT, new RythmicString("иных", "09"), new RythmicString("иных", "09"), new RythmicString("ичах", "90"), new RythmicString("иничным", "901")),
    
    A_Acct_I_nom(Endings.A_ACCT, Endings.A_ACCT, new RythmicString("ин", "9"), new RythmicString("ина", "09"), new RythmicString("ич", "9"), new RythmicString("инична", "901")),
    A_Acct_I_gen(Endings.I_ACCT, Endings.I_ACCT, new RythmicString("ина", "90"), new RythmicString("иной", "09"), new RythmicString("ича", "90"), new RythmicString("иничны", "901")),
    A_Acct_I_dat(Endings.E_ACCT, Endings.E_ACCT, new RythmicString("ину", "90"), new RythmicString("иной", "09"), new RythmicString("ичу", "90"), new RythmicString("иничне", "901")),
    A_Acct_I_acc(Endings.U_ACCT, Endings.U_ACCT, new RythmicString("ина", "90"), new RythmicString("ину", "09"), new RythmicString("ича", "90"), new RythmicString("иничну", "901")),
    A_Acct_I_abl(Endings.OJ_ACCT, Endings.OJ_ACCT, new RythmicString("иным", "90"), new RythmicString("иной", "09"), new RythmicString("ичом", "90"), new RythmicString("иничной", "901")),
    A_Acct_I_pre(Endings.E_ACCT, Endings.E_ACCT, new RythmicString("ине", "90"), new RythmicString("иной", "09"), new RythmicString("иче", "90"), new RythmicString("иничне", "901")),
    
    A_Free_Ы_nom(Endings.A_FREE, Endings.A_FREE, new RythmicString("ин", "0"), new RythmicString("ина", "01"), new RythmicString("ич", "0"), new RythmicString("ична", "01")),
    A_Free_Ы_gen(Endings.Ы_FREE, Endings.Ы_FREE, new RythmicString("ина", "01"), new RythmicString("иной", "01"), new RythmicString("ича", "01"), new RythmicString("ичны", "01")),
    A_Free_Ы_dat(Endings.E_FREE, Endings.E_FREE, new RythmicString("ину", "01"), new RythmicString("иной", "01"), new RythmicString("ичу", "01"), new RythmicString("ичне", "01")),
    A_Free_Ы_acc(Endings.U_FREE, Endings.U_FREE, new RythmicString("ина", "01"), new RythmicString("ину", "01"), new RythmicString("ича", "01"), new RythmicString("ичну", "01")),
    A_Free_Ы_abl(Endings.OJ_FREE, Endings.OJ_FREE, new RythmicString("иным", "01"), new RythmicString("иной", "01"), new RythmicString("ичом", "01"), new RythmicString("ичной", "01")),
    A_Free_Ы_pre(Endings.E_FREE, Endings.E_FREE, new RythmicString("ине", "01"), new RythmicString("иной", "01"), new RythmicString("иче", "01"), new RythmicString("ичне", "01")),
    
    A_Free_I_nom(Endings.A_FREE, Endings.A_FREE, new RythmicString("ин", "0"), new RythmicString("ина", "01"), new RythmicString("ич", "0"), new RythmicString("ична", "01")),
    A_Free_I_gen(Endings.I_FREE, Endings.I_FREE, new RythmicString("ина", "01"), new RythmicString("иной", "01"), new RythmicString("ича", "01"), new RythmicString("ичны", "01")),
    A_Free_I_dat(Endings.E_FREE, Endings.E_FREE, new RythmicString("ину", "01"), new RythmicString("иной", "01"), new RythmicString("ичу", "01"), new RythmicString("ичне", "01")),
    A_Free_I_acc(Endings.U_FREE, Endings.U_FREE, new RythmicString("ина", "01"), new RythmicString("ину", "01"), new RythmicString("ича", "01"), new RythmicString("ичну", "01")),
    A_Free_I_abl(Endings.OJ_FREE, Endings.OJ_FREE, new RythmicString("иным", "01"), new RythmicString("иной", "01"), new RythmicString("ичом", "01"), new RythmicString("ичной", "01")),
    A_Free_I_pre(Endings.E_FREE, Endings.E_FREE, new RythmicString("ине", "01"), new RythmicString("иной", "01"), new RythmicString("иче", "01"), new RythmicString("ичне", "01")),
    
    AJ_nom(new RythmicString("ай", "9"), new RythmicString("айя", "90"), new RythmicString("аев", "90"), new RythmicString("аева", "901"), new RythmicString("аевич", "901"), new RythmicString("аевна", "901")),
    AJ_gen(new RythmicString("ая", "90"), new RythmicString("айи", "90"), new RythmicString("аева", "901"), new RythmicString("аевой", "901"), new RythmicString("аевича", "9012"), new RythmicString("аевны", "901")),
    AJ_dat(new RythmicString("аю", "90"), new RythmicString("айе", "90"), new RythmicString("аеву", "901"), new RythmicString("аевой", "901"), new RythmicString("аевичу", "9012"), new RythmicString("аевне", "901")),
    AJ_acc(new RythmicString("ая", "90"), new RythmicString("айю", "90"), new RythmicString("аева", "901"), new RythmicString("аеву", "901"), new RythmicString("аевича", "9012"), new RythmicString("аевну", "901")),
    AJ_abl(new RythmicString("аем", "90"), new RythmicString("айей", "90"), new RythmicString("аевым", "901"), new RythmicString("аевой", "901"), new RythmicString("аевичу", "9012"), new RythmicString("аевной", "901")),
    AJ_pre(new RythmicString("ае", "90"), new RythmicString("айе", "90"), new RythmicString("аеве", "901"), new RythmicString("аевой", "901"), new RythmicString("аевич", "9012"), new RythmicString("аевне", "901")),
    
    EJ_ЬEV_nom(new RythmicString("ей", "9"), new RythmicString("ея", "90"), new RythmicString("ьев", "9"), new RythmicString("ьева", "90"), new RythmicString("ьевич", "90"), new RythmicString("ьевна", "90")),
    EJ_ЬEV_gen(new RythmicString("ья", "9"), new RythmicString("еи", "90"), new RythmicString("ьева", "90"), new RythmicString("ьевой", "90"), new RythmicString("ьевича", "9012"), new RythmicString("ьевны", "90")),
    EJ_ЬEV_dat(new RythmicString("ью", "9"), new RythmicString("ее", "90"), new RythmicString("ьеву", "90"), new RythmicString("ьевой", "90"), new RythmicString("ьевичу", "9012"), new RythmicString("ьевне", "90")),
    EJ_ЬEV_acc(new RythmicString("ья", "9"), new RythmicString("ею", "90"), new RythmicString("ьева", "90"), new RythmicString("ьеву", "90"), new RythmicString("ьевича", "9012"), new RythmicString("ьевну", "90")),
    EJ_ЬEV_abl(new RythmicString("ьем", "9"), new RythmicString("еей", "90"), new RythmicString("ьевым", "90"), new RythmicString("ьевой", "90"), new RythmicString("ьевичем", "9012"), new RythmicString("ьевной", "90")),
    EJ_ЬEV_pre(new RythmicString("ье", "9"), new RythmicString("ее", "90"), new RythmicString("ьеве", "90"), new RythmicString("ьевой", "90"), new RythmicString("ьевиче", "9012"), new RythmicString("ьевне", "90")),
    
    EJ_EEV_nom(new RythmicString("ей", "9"), new RythmicString("ея", "90"), new RythmicString("еев", "90"), new RythmicString("еева", "901"), new RythmicString("еевич", "901"), new RythmicString("еевна", "901")),
    EJ_EEV_gen(new RythmicString("ея", "90"), new RythmicString("еи", "90"), new RythmicString("еева", "901"), new RythmicString("еевой", "901"), new RythmicString("еевича", "9012"), new RythmicString("еевны", "901")),
    EJ_EEV_dat(new RythmicString("ею", "90"), new RythmicString("ее", "90"), new RythmicString("ееву", "901"), new RythmicString("еевой", "901"), new RythmicString("еевичу", "9012"), new RythmicString("еевне", "901")),
    EJ_EEV_acc(new RythmicString("ея", "90"), new RythmicString("ею", "90"), new RythmicString("еева", "901"), new RythmicString("ееву", "901"), new RythmicString("еевича", "9012"), new RythmicString("еевну", "901")),
    EJ_EEV_abl(new RythmicString("еем", "90"), new RythmicString("еей", "90"), new RythmicString("еевым", "901"), new RythmicString("еевой", "901"), new RythmicString("еевичем", "9012"), new RythmicString("еевной", "901")),
    EJ_EEV_pre(new RythmicString("ее", "90"), new RythmicString("ее", "90"), new RythmicString("ееве", "901"), new RythmicString("еевой", "901"), new RythmicString("еевиче", "9012"), new RythmicString("еевне", "901")),
    
    EL_nom(new RythmicString("ел", "0"), new RythmicString("ла", "0"), new RythmicString("лов", "0"), new RythmicString("лова", "01"), new RythmicString("лович", "01"), new RythmicString("ловна", "01")),
    EL_gen(new RythmicString("ла", "0"), new RythmicString("лы", "0"), new RythmicString("лова", "01"), new RythmicString("ловой", "01"), new RythmicString("ловича", "012"), new RythmicString("ловны", "01")),
    EL_dat(new RythmicString("лу", "0"), new RythmicString("ле", "0"), new RythmicString("лову", "01"), new RythmicString("ловой", "01"), new RythmicString("ловичу", "012"), new RythmicString("ловне", "01")),
    EL_acc(new RythmicString("ла", "0"), new RythmicString("лу", "0"), new RythmicString("лова", "01"), new RythmicString("лову", "01"), new RythmicString("ловича", "012"), new RythmicString("ловну", "01")),
    EL_abl(new RythmicString("лом", "0"), new RythmicString("лой", "0"), new RythmicString("ловым", "01"), new RythmicString("ловой", "01"), new RythmicString("ловичем", "012"), new RythmicString("ловной", "01")),
    EL_pre(new RythmicString("ле", "0"), new RythmicString("ле", "0"), new RythmicString("лове", "01"), new RythmicString("ловой", "01"), new RythmicString("ловиче", "012"), new RythmicString("ловне", "01")),
    
    ID_ЫDOV_nom(new RythmicString("ид", "9"), new RythmicString("ида", "90"), new RythmicString("ыдов", "90"), new RythmicString("ыдова", "901"), new RythmicString("ыдович", "901"), new RythmicString("ыдовна", "901")),
    ID_ЫDOV_gen(new RythmicString("ида", "90"), new RythmicString("иды", "90"), new RythmicString("ыдова", "901"), new RythmicString("ыдовой", "901"), new RythmicString("ыдовича", "9012"), new RythmicString("ыдовны", "901")),
    ID_ЫDOV_dat(new RythmicString("иду", "90"), new RythmicString("иде", "90"), new RythmicString("ыдову", "901"), new RythmicString("ыдовой", "901"), new RythmicString("ыдовичу", "9012"), new RythmicString("ыдовне", "901")),
    ID_ЫDOV_acc(new RythmicString("ида", "90"), new RythmicString("иду", "90"), new RythmicString("ыдова", "901"), new RythmicString("ыдову", "901"), new RythmicString("ыдовича", "9012"), new RythmicString("ыдовну", "901")),
    ID_ЫDOV_abl(new RythmicString("идом", "90"), new RythmicString("идой", "90"), new RythmicString("ыдовым", "901"), new RythmicString("ыдовой", "901"), new RythmicString("ыдовичем", "9012"), new RythmicString("ыдовной", "901")),
    ID_ЫDOV_pre(new RythmicString("иде", "90"), new RythmicString("иде", "90"), new RythmicString("ыдове", "901"), new RythmicString("ыдовой", "901"), new RythmicString("ыдовиче", "9012"), new RythmicString("ыдовне", "901")),
    
    ID_IDOV_nom(new RythmicString("ид", "9"), new RythmicString("ида", "90"), new RythmicString("идов", "90"), new RythmicString("идова", "901"), new RythmicString("идович", "901"), new RythmicString("идовна", "901")),
    ID_IDOV_gen(new RythmicString("ида", "90"), new RythmicString("иды", "90"), new RythmicString("идова", "901"), new RythmicString("идовой", "901"), new RythmicString("идовича", "9012"), new RythmicString("идовны", "901")),
    ID_IDOV_dat(new RythmicString("иду", "90"), new RythmicString("иде", "90"), new RythmicString("идову", "901"), new RythmicString("идовой", "901"), new RythmicString("идовичу", "9012"), new RythmicString("идовне", "901")),
    ID_IDOV_acc(new RythmicString("ида", "90"), new RythmicString("иду", "90"), new RythmicString("идова", "901"), new RythmicString("идову", "901"), new RythmicString("идовича", "9012"), new RythmicString("идовну", "901")),
    ID_IDOV_abl(new RythmicString("идом", "90"), new RythmicString("идой", "90"), new RythmicString("идовым", "901"), new RythmicString("идовой", "901"), new RythmicString("идовичем", "9012"), new RythmicString("идовной", "901")),
    ID_IDOV_pre(new RythmicString("иде", "90"), new RythmicString("иде", "90"), new RythmicString("идове", "901"), new RythmicString("идовой", "901"), new RythmicString("идовиче", "9012"), new RythmicString("идовне", "901")),
    
    IIL_ILOV_nom(new RythmicString("иил", "09"), Endings.A_FREE, new RythmicString("илов", "90"), new RythmicString("илова", "901"), new RythmicString("илович", "901"), new RythmicString("иловна", "901")),
    IIL_ILOV_gen(new RythmicString("иила", "090"), Endings.Ы_FREE, new RythmicString("илова", "901"), new RythmicString("иловой", "901"), new RythmicString("иловича", "9012"), new RythmicString("иловны", "901")),
    IIL_ILOV_dat(new RythmicString("иилу", "090"), Endings.E_FREE, new RythmicString("илову", "901"), new RythmicString("иловой", "901"), new RythmicString("иловичу", "9012"), new RythmicString("иловне", "901")),
    IIL_ILOV_acc(new RythmicString("иила", "090"), Endings.U_FREE, new RythmicString("илова", "901"), new RythmicString("илову", "901"), new RythmicString("иловича", "9012"), new RythmicString("иловну", "901")),
    IIL_ILOV_abl(new RythmicString("иилом", "090"), Endings.OJ_FREE, new RythmicString("иловым", "901"), new RythmicString("иловой", "901"), new RythmicString("иловичем", "9012"), new RythmicString("иловной", "901")),
    IIL_ILOV_pre(new RythmicString("ииле", "090"), Endings.E_FREE, new RythmicString("илове", "901"), new RythmicString("иловой", "901"), new RythmicString("иловиче", "9012"), new RythmicString("иловне", "901")),
    
    IJ_ЬEV_nom(new RythmicString("ий", "0"), new RythmicString("ья", "0"), new RythmicString("ьев", "0"), new RythmicString("ьева", "01"), new RythmicString("ьевич", "01"), new RythmicString("ьевна", "01")),
    IJ_ЬEV_gen(new RythmicString("ия", "01"), new RythmicString("ьи", "0"), new RythmicString("ьева", "01"), new RythmicString("ьевой", "01"), new RythmicString("ьевича", "012"), new RythmicString("ьевны", "01")),
    IJ_ЬEV_dat(new RythmicString("ию", "01"), new RythmicString("ьи", "0"), new RythmicString("ьеву", "01"), new RythmicString("ьевой", "01"), new RythmicString("ьевичу", "012"), new RythmicString("ьевне", "01")),
    IJ_ЬEV_acc(new RythmicString("ия", "01"), new RythmicString("ью", "0"), new RythmicString("ьева", "01"), new RythmicString("ьеву", "01"), new RythmicString("ьевича", "012"), new RythmicString("ьевну", "01")),
    IJ_ЬEV_abl(new RythmicString("ием", "01"), new RythmicString("ьей", "0"), new RythmicString("ьевым", "01"), new RythmicString("ьевой", "01"), new RythmicString("ьевичем", "012"), new RythmicString("ьевной", "01")),
    IJ_ЬEV_pre(new RythmicString("ии", "01"), new RythmicString("ье", "0"), new RythmicString("ьеве", "01"), new RythmicString("ьевой", "01"), new RythmicString("ьевиче", "012"), new RythmicString("ьевне", "01")),
    
    IJ_IEV_nom(new RythmicString("ий", "0"), new RythmicString("ия", "01"), new RythmicString("иев", "01"), new RythmicString("иева", "010"), new RythmicString("иевич", "012"), new RythmicString("иевна", "010")),
    IJ_IEV_gen(new RythmicString("ия", "01"), new RythmicString("ии", "01"), new RythmicString("иева", "012"), new RythmicString("иевой", "010"), new RythmicString("иевича", "0121"), new RythmicString("иевны", "010")),
    IJ_IEV_dat(new RythmicString("ию", "01"), new RythmicString("ии", "01"), new RythmicString("иеву", "012"), new RythmicString("иевой", "010"), new RythmicString("иевичу", "0121"), new RythmicString("иевне", "010")),
    IJ_IEV_acc(new RythmicString("ия", "01"), new RythmicString("ию", "01"), new RythmicString("иева", "012"), new RythmicString("иеву", "010"), new RythmicString("иевича", "0121"), new RythmicString("иевну", "010")),
    IJ_IEV_abl(new RythmicString("ием", "01"), new RythmicString("ией", "01"), new RythmicString("иевым", "012"), new RythmicString("иевой", "010"), new RythmicString("иевичем", "0121"), new RythmicString("иевной", "010")),
    IJ_IEV_pre(new RythmicString("ии", "01"), new RythmicString("ии", "01"), new RythmicString("иеве", "012"), new RythmicString("иевой", "010"), new RythmicString("иевиче", "0121"), new RythmicString("иевне", "010")),
    
    IJ_IN_nom(new RythmicString("ий", "0"), new RythmicString("ия", "90"), new RythmicString("ьин", "0"), new RythmicString("ьина", "01"), new RythmicString("ьич", "0"), new RythmicString("ьична", "01")),
    IJ_IN_gen(new RythmicString("ия", "01"), new RythmicString("ии", "90"), new RythmicString("ьина", "01"), new RythmicString("ьиной", "01"), new RythmicString("ьича", "01"), new RythmicString("ьичны", "01")),
    IJ_IN_dat(new RythmicString("ию", "01"), new RythmicString("ии", "90"), new RythmicString("ьину", "01"), new RythmicString("ьиной", "01"), new RythmicString("ьичу", "01"), new RythmicString("ьичне", "01")),
    IJ_IN_acc(new RythmicString("ия", "01"), new RythmicString("ию", "90"), new RythmicString("ьина", "01"), new RythmicString("ьину", "01"), new RythmicString("ьича", "01"), new RythmicString("ьичну", "01")),
    IJ_IN_abl(new RythmicString("ием", "01"), new RythmicString("ией", "90"), new RythmicString("ьиным", "01"), new RythmicString("ьиной", "01"), new RythmicString("ьичем", "01"), new RythmicString("ьичной", "01")),
    IJ_IN_pre(new RythmicString("ии", "01"), new RythmicString("ии", "90"), new RythmicString("ьине", "01"), new RythmicString("ьиной", "01"), new RythmicString("ьиче", "01"), new RythmicString("ьичне", "01")),
    
    IL_JLOV_nom(new RythmicString("ил", "9"), new RythmicString("ила", "90"), new RythmicString("йлов", "0"), new RythmicString("йлова", "01"), new RythmicString("йлович", "01"), new RythmicString("йловна", "01")),
    IL_JLOV_gen(new RythmicString("ила", "90"), new RythmicString("илы", "90"), new RythmicString("йлова", "01"), new RythmicString("йловой", "01"), new RythmicString("йловича", "012"), new RythmicString("йловны", "01")),
    IL_JLOV_dat(new RythmicString("илу", "90"), new RythmicString("иле", "90"), new RythmicString("йлову", "01"), new RythmicString("йловой", "01"), new RythmicString("йловичу", "012"), new RythmicString("йловне", "01")),
    IL_JLOV_acc(new RythmicString("ила", "90"), new RythmicString("илу", "90"), new RythmicString("йлова", "01"), new RythmicString("йлову", "01"), new RythmicString("йловича", "012"), new RythmicString("йловну", "01")),
    IL_JLOV_abl(new RythmicString("илом", "90"), new RythmicString("илой", "90"), new RythmicString("йловым", "01"), new RythmicString("йловой", "01"), new RythmicString("йловичем", "012"), new RythmicString("йловной", "01")),
    IL_JLOV_pre(new RythmicString("иле", "90"), new RythmicString("иле", "90"), new RythmicString("йлове", "01"), new RythmicString("йловой", "01"), new RythmicString("йловиче", "012"), new RythmicString("йловне", "01")),
    
    L_OV_nom(new RythmicString("л"), new RythmicString("ла", "0"), new RythmicString("ов", "0"), new RythmicString("ова", "01"), new RythmicString("лович", "01"), new RythmicString("ловна", "01")),
    L_OV_gen(new RythmicString("ла","0"), new RythmicString("лы", "0"), new RythmicString("ова", "01"), new RythmicString("овой", "01"), new RythmicString("ловича", "012"), new RythmicString("ловны", "01")),
    L_OV_dat(new RythmicString("лу","0"), new RythmicString("ле", "0"), new RythmicString("ову", "01"), new RythmicString("овой", "01"), new RythmicString("ловичу", "012"), new RythmicString("ловне", "01")),
    L_OV_acc(new RythmicString("ла","0"), new RythmicString("лу", "0"), new RythmicString("ова", "01"), new RythmicString("овой", "01"), new RythmicString("ловича", "012"), new RythmicString("ловну", "01")),
    L_OV_abl(new RythmicString("лом","0"), new RythmicString("лой", "0"), new RythmicString("овым", "01"), new RythmicString("овой", "01"), new RythmicString("ловичем", "012"), new RythmicString("ловной", "01")),
    L_OV_pre(new RythmicString("ле","0"), new RythmicString("ле", "0"), new RythmicString("ове", "01"), new RythmicString("овой", "01"), new RythmicString("ловиче", "012"), new RythmicString("ловне", "01")),
    
    OK_KOV_Acct_nom(new RythmicString("ок","9"), new RythmicString("ка", "0"), new RythmicString("ков", "9"), new RythmicString("кова", "90"), new RythmicString("кович", "90"), new RythmicString("ковна", "90")),
    OK_KOV_Acct_gen(new RythmicString("ка","9"), new RythmicString("ки", "0"), new RythmicString("кова", "90"), new RythmicString("ковой", "90"), new RythmicString("ковича", "901"), new RythmicString("ковны", "90")),
    OK_KOV_Acct_dat(new RythmicString("ку","9"), new RythmicString("ке", "0"), new RythmicString("кову", "90"), new RythmicString("ковой", "90"), new RythmicString("ковичу", "901"), new RythmicString("ковне", "90")),
    OK_KOV_Acct_acc(new RythmicString("ка","9"), new RythmicString("ку", "0"), new RythmicString("кова", "90"), new RythmicString("кову", "90"), new RythmicString("ковича", "901"), new RythmicString("ковну", "90")),
    OK_KOV_Acct_abl(new RythmicString("ком","9"), new RythmicString("кой", "0"), new RythmicString("ковым", "90"), new RythmicString("ковой", "90"), new RythmicString("ковичем", "901"), new RythmicString("ковной", "90")),
    OK_KOV_Acct_pre(new RythmicString("ке","9"), new RythmicString("ке", "0"), new RythmicString("кове", "90"), new RythmicString("ковой", "90"), new RythmicString("ковиче", "901"), new RythmicString("ковне", "90")),
    
    
    OK_KOV_Free_nom(new RythmicString("ок","0"), new RythmicString("ка", "0"), new RythmicString("ков", "0"), new RythmicString("кова", "01"), new RythmicString("кович", "01"), new RythmicString("ковна", "01")),
    OK_KOV_Free_gen(new RythmicString("ка","0"), new RythmicString("ки", "0"), new RythmicString("кова", "01"), new RythmicString("ковой", "01"), new RythmicString("ковича", "012"), new RythmicString("ковны", "01")),
    OK_KOV_Free_dat(new RythmicString("ку","0"), new RythmicString("ке", "0"), new RythmicString("кову", "01"), new RythmicString("ковой", "01"), new RythmicString("ковичу", "012"), new RythmicString("ковне", "01")),
    OK_KOV_Free_acc(new RythmicString("ка","0"), new RythmicString("ку", "0"), new RythmicString("кова", "01"), new RythmicString("кову", "01"), new RythmicString("ковича", "012"), new RythmicString("ковну", "01")),
    OK_KOV_Free_abl(new RythmicString("ком","0"), new RythmicString("кой", "0"), new RythmicString("ковым", "01"), new RythmicString("ковой", "01"), new RythmicString("ковичем", "012"), new RythmicString("ковной", "01")),
    OK_KOV_Free_pre(new RythmicString("ке","0"), new RythmicString("ке", "0"), new RythmicString("кове", "01"), new RythmicString("ковой", "01"), new RythmicString("ковиче", "012"), new RythmicString("ковне", "01")),
    
    OL_LOV_Acct_nom(new RythmicString("ол","9"), new RythmicString("ла", "0"), new RythmicString("лов", "9"), new RythmicString("лова", "90"), new RythmicString("лович", "90"), new RythmicString("ловна", "90")),
    OL_LOV_Acct_gen(new RythmicString("ла","9"), new RythmicString("лы", "0"), new RythmicString("лова", "90"), new RythmicString("ловой", "90"), new RythmicString("ловича", "901"), new RythmicString("ловны", "90")),
    OL_LOV_Acct_dat(new RythmicString("лу","9"), new RythmicString("ле", "0"), new RythmicString("лову", "90"), new RythmicString("ловой", "90"), new RythmicString("ловичу", "901"), new RythmicString("ловне", "90")),
    OL_LOV_Acct_acc(new RythmicString("ла","9"), new RythmicString("лу", "0"), new RythmicString("лова", "90"), new RythmicString("лову", "90"), new RythmicString("ловича", "901"), new RythmicString("ловну", "90")),
    OL_LOV_Acct_abl(new RythmicString("лом","9"), new RythmicString("лой", "0"), new RythmicString("ловым", "90"), new RythmicString("ловой", "90"), new RythmicString("ловичем", "901"), new RythmicString("ловной", "90")),
    OL_LOV_Acct_pre(new RythmicString("ле","9"), new RythmicString("ле", "0"), new RythmicString("лове", "90"), new RythmicString("ловой", "90"), new RythmicString("ловиче", "901"), new RythmicString("ловне", "90")),
    
    OL_LOV_Free_nom(new RythmicString("ол","0"), new RythmicString("ла", "0"), new RythmicString("лов", "0"), new RythmicString("лова", "01"), new RythmicString("лович", "01"), new RythmicString("ловна", "01")),
    OL_LOV_Free_gen(new RythmicString("ла","0"), new RythmicString("лы", "0"), new RythmicString("лова", "01"), new RythmicString("ловой", "01"), new RythmicString("ловича", "012"), new RythmicString("ловны", "01")),
    OL_LOV_Free_dat(new RythmicString("лу","0"), new RythmicString("ле", "0"), new RythmicString("лову", "01"), new RythmicString("ловой", "01"), new RythmicString("ловичу", "012"), new RythmicString("ловне", "01")),
    OL_LOV_Free_acc(new RythmicString("ла","0"), new RythmicString("лу", "0"), new RythmicString("лова", "01"), new RythmicString("лову", "01"), new RythmicString("ловича", "012"), new RythmicString("ловну", "01")),
    OL_LOV_Free_abl(new RythmicString("лом","0"), new RythmicString("лой", "0"), new RythmicString("ловым", "01"), new RythmicString("ловой", "01"), new RythmicString("ловичем", "012"), new RythmicString("ловной", "01")),
    OL_LOV_Free_pre(new RythmicString("ле","0"), new RythmicString("ле", "0"), new RythmicString("лове", "01"), new RythmicString("ловой", "01"), new RythmicString("ловиче", "012"), new RythmicString("ловне", "01")),
    
    OVЬ_nom(new RythmicString(""), new RythmicString("овь", "9"), new RythmicString("ин", "0"), new RythmicString("ина", "01"), new RythmicString("ич", "0"), new RythmicString("инична", "901")),
    OVЬ_gen(new RythmicString("а","0"), new RythmicString("ови", "90"), new RythmicString("ина", "0"), new RythmicString("иной", "01"), new RythmicString("ича", "01"), new RythmicString("иничны", "901")),
    OVЬ_dat(new RythmicString("у","0"), new RythmicString("ови", "90"), new RythmicString("ину", "0"), new RythmicString("иной", "01"), new RythmicString("ичу", "01"), new RythmicString("иничне", "901")),
    OVЬ_acc(new RythmicString("а","0"), new RythmicString("овь", "9"), new RythmicString("ина", "0"), new RythmicString("ину", "01"), new RythmicString("ича", "01"), new RythmicString("иничну", "901")),
    OVЬ_abl(new RythmicString("ом","0"), new RythmicString("овью", "90"), new RythmicString("иным", "0"), new RythmicString("иной", "01"), new RythmicString("ичем", "01"), new RythmicString("иничной", "901")),
    OVЬ_pre(new RythmicString("е","0"), new RythmicString("ови", "90"), new RythmicString("ине", "0"), new RythmicString("иной", "01"), new RythmicString("иче", "01"), new RythmicString("иничне", "901")),
    
    P_OV_nom(new RythmicString("п"), new RythmicString("па", "0"), new RythmicString("ов", "0"), new RythmicString("ова", "01"), new RythmicString("пович", "01"), new RythmicString("повна", "01")),
    P_OV_gen(new RythmicString("па","0"), new RythmicString("пы", "0"), new RythmicString("ова", "01"), new RythmicString("овой", "01"), new RythmicString("повича", "01"), new RythmicString("повны", "01")),
    P_OV_dat(new RythmicString("пу","0"), new RythmicString("пе", "0"), new RythmicString("ову", "01"), new RythmicString("овой", "01"), new RythmicString("повичу", "01"), new RythmicString("повне", "01")),
    P_OV_acc(new RythmicString("па","0"), new RythmicString("пу", "0"), new RythmicString("ова", "01"), new RythmicString("ову", "01"), new RythmicString("повича", "01"), new RythmicString("повну", "01")),
    P_OV_abl(new RythmicString("пом","0"), new RythmicString("пой", "0"), new RythmicString("овым", "01"), new RythmicString("овой", "01"), new RythmicString("повичем", "01"), new RythmicString("повной", "01")),
    P_OV_pre(new RythmicString("пе","0"), new RythmicString("пе", "0"), new RythmicString("ове", "01"), new RythmicString("овой", "01"), new RythmicString("повиче", "01"), new RythmicString("повне", "01")),
    
    UY_nom(new RythmicString("уй", "9"), new RythmicString("оя", "90"), new RythmicString("уев", "90"), new RythmicString("уева", "901"), new RythmicString("уевич", "901"), new RythmicString("уевна", "901")),
    UY_gen(new RythmicString("уя", "90"), new RythmicString("ои", "90"), new RythmicString("уева", "901"), new RythmicString("уевой", "901"), new RythmicString("уевича", "9012"), new RythmicString("уевны", "901")),
    UY_dat(new RythmicString("ую", "90"), new RythmicString("ое", "90"), new RythmicString("уеву", "901"), new RythmicString("уевой", "901"), new RythmicString("уевичу", "9012"), new RythmicString("уевне", "901")),
    UY_acc(new RythmicString("уя", "90"), new RythmicString("ою", "90"), new RythmicString("уева", "901"), new RythmicString("уеву", "901"), new RythmicString("уевича", "9012"), new RythmicString("уевну", "901")),
    UY_abl(new RythmicString("уем", "90"), new RythmicString("оей", "90"), new RythmicString("уевым", "901"), new RythmicString("уевой", "901"), new RythmicString("уевичем", "9012"), new RythmicString("уевной", "901")),
    UY_pre(new RythmicString("уе", "90"), new RythmicString("ое", "90"), new RythmicString("уеве", "901"), new RythmicString("уевой", "901"), new RythmicString("уевиче", "9012"), new RythmicString("уевне", "901")),
    
    /**
     * Ударное окончание "я", например как в имени Илья.
     */
    Y_Acct(new RythmicString("я", "9"), new RythmicString("я", "9"), new RythmicString("ин", "9"), new RythmicString("ина", "90"), new RythmicString("ич", "9"), new RythmicString("инична", "901")),
    /**
     * Безударное окончание "я", как в имени Ия.
     */
    Y_Free(new RythmicString("я", "0"), new RythmicString("я", "0"), new RythmicString("ин", "0"), new RythmicString("ина", "01"), new RythmicString("ич", "0"), new RythmicString("ична", "01")),
    /**
     * Окончание "яй", как в фамилии Беляев.
     */
    YJ(new RythmicString("яй", "9"), new RythmicString("яя", "90"), new RythmicString("яев", "90"), new RythmicString("яева", "901"), new RythmicString("яевич", "901"), new RythmicString("яевна", "901")),
    /**
     * Пустое окончание, как в имени Яков.
     */
    EMPTY_LEV(new RythmicString(""), new RythmicString("а", "1"), new RythmicString("лев", "1"), new RythmicString("лева", "01"), new RythmicString("левич", "01"), new RythmicString("левна", "01")),
    
    EMPTY_OV_Acct_I_nom(new RythmicString(""), Endings.A_ACCT, new RythmicString("ов", "9"), new RythmicString("ова", "90"), new RythmicString("ович", "90"), new RythmicString("овна", "90")),
    EMPTY_OV_Acct_I_gen(new RythmicString("а","9"), Endings.I_ACCT, new RythmicString("ова", "90"), new RythmicString("овой", "90"), new RythmicString("овича", "901"), new RythmicString("овны", "90")),
    EMPTY_OV_Acct_I_dat(new RythmicString("у","9"), Endings.E_ACCT, new RythmicString("ову", "90"), new RythmicString("овой", "90"), new RythmicString("овичу", "901"), new RythmicString("овне", "90")),
    EMPTY_OV_Acct_I_acc(new RythmicString("а","9"), Endings.U_ACCT, new RythmicString("ова", "90"), new RythmicString("ову", "90"), new RythmicString("овича", "901"), new RythmicString("овну", "90")),
    EMPTY_OV_Acct_I_abl(new RythmicString("ом","9"), Endings.OJ_ACCT, new RythmicString("овым", "90"), new RythmicString("овой", "90"), new RythmicString("овичем", "901"), new RythmicString("овной", "90")),
    EMPTY_OV_Acct_I_pre(new RythmicString("е","9"), Endings.E_ACCT, new RythmicString("ове", "90"), new RythmicString("овой", "90"), new RythmicString("овиче", "901"), new RythmicString("овне", "90")),
    
    EMPTY_OV_Free_I_nom(new RythmicString(""), Endings.A_FREE, new RythmicString("ов", "0"), new RythmicString("ова", "01"), new RythmicString("ович", "01"), new RythmicString("овна", "01")),
    EMPTY_OV_Free_I_gen(new RythmicString("а","0"), Endings.I_FREE, new RythmicString("ова", "01"), new RythmicString("овой", "01"), new RythmicString("овича", "010"), new RythmicString("овны", "01")),
    EMPTY_OV_Free_I_dat(new RythmicString("у","0"), Endings.E_FREE, new RythmicString("ову", "01"), new RythmicString("овой", "01"), new RythmicString("овичу", "010"), new RythmicString("овне", "01")),
    EMPTY_OV_Free_I_acc(new RythmicString("а","0"), Endings.U_FREE, new RythmicString("ова", "01"), new RythmicString("ову", "01"), new RythmicString("овича", "010"), new RythmicString("овну", "01")),
    EMPTY_OV_Free_I_abl(new RythmicString("ом","0"), Endings.OJ_FREE, new RythmicString("овым", "01"), new RythmicString("овой", "01"), new RythmicString("овичем", "010"), new RythmicString("овной", "01")),
    EMPTY_OV_Free_I_pre(new RythmicString("е","0"), Endings.E_FREE, new RythmicString("ове", "01"), new RythmicString("ове", "01"), new RythmicString("овиче", "010"), new RythmicString("овне", "01")),
    
    EMPTY_OV_Acct_Ы_nom(new RythmicString(""), Endings.A_ACCT, new RythmicString("ов", "9"), new RythmicString("ова", "90"), new RythmicString("ович", "90"), new RythmicString("овна", "90")),
    EMPTY_OV_Acct_Ы_gen(new RythmicString("а","9"), Endings.Ы_ACCT, new RythmicString("ова", "90"), new RythmicString("овой", "90"), new RythmicString("овича", "901"), new RythmicString("овны", "90")),
    EMPTY_OV_Acct_Ы_dat(new RythmicString("у","9"), Endings.E_ACCT, new RythmicString("ову", "90"), new RythmicString("овой", "90"), new RythmicString("овичу", "901"), new RythmicString("овне", "90")),
    EMPTY_OV_Acct_Ы_acc(new RythmicString("а","9"), Endings.U_ACCT, new RythmicString("ова", "90"), new RythmicString("ову", "90"), new RythmicString("овича", "901"), new RythmicString("овну", "90")),
    EMPTY_OV_Acct_Ы_abl(new RythmicString("ом","9"), Endings.OJ_ACCT, new RythmicString("овым", "90"), new RythmicString("овой", "90"), new RythmicString("овичем", "901"), new RythmicString("овной", "90")),
    EMPTY_OV_Acct_Ы_pre(new RythmicString("е","9"), Endings.E_ACCT, new RythmicString("ове", "90"), new RythmicString("овой", "90"), new RythmicString("овиче", "901"), new RythmicString("овне", "90")),
    
    EMPTY_OV_Free_Ы_nom(new RythmicString(""), Endings.A_FREE, new RythmicString("ов", "0"), new RythmicString("ова", "01"), new RythmicString("ович", "01"), new RythmicString("овна", "01")),
    EMPTY_OV_Free_Ы_gen(new RythmicString("а","0"), Endings.Ы_FREE, new RythmicString("ова", "01"), new RythmicString("овой", "01"), new RythmicString("овича", "010"), new RythmicString("овны", "01")),
    EMPTY_OV_Free_Ы_dat(new RythmicString("у","0"), Endings.E_FREE, new RythmicString("ову", "01"), new RythmicString("овой", "01"), new RythmicString("овичу", "010"), new RythmicString("овне", "01")),
    EMPTY_OV_Free_Ы_acc(new RythmicString("а","0"), Endings.U_FREE, new RythmicString("ова", "01"), new RythmicString("ову", "01"), new RythmicString("овича", "010"), new RythmicString("овну", "01")),
    EMPTY_OV_Free_Ы_abl(new RythmicString("ом","0"), Endings.OJ_FREE, new RythmicString("овым", "01"), new RythmicString("овой", "01"), new RythmicString("овичем", "010"), new RythmicString("овной", "01")),
    EMPTY_OV_Free_Ы_pre(new RythmicString("е","0"), Endings.E_FREE, new RythmicString("ове", "01"), new RythmicString("ове", "01"), new RythmicString("овиче", "010"), new RythmicString("овне", "01")),
    
    /**
     * Окончание "ь", например как в имени Игорь.
     */
    SOFT_Free(new RythmicString("ь"), new RythmicString("я", "0"), new RythmicString("ев", "0"), new RythmicString("ева", "01"), new RythmicString("евич", "01"), new RythmicString("евна", "01")),
    /**
     * Окончание "ь", например как в фамилии Бобылев.
     */
    SOFT_Acct(new RythmicString("ь"), new RythmicString("я", "9"), new RythmicString("ев", "9"), new RythmicString("ева", "90"), new RythmicString("евич", "90"), new RythmicString("евна", "90"));

    private final RythmicString endNameMale;
    private final RythmicString endNameFemale;
    private final RythmicString endFamMale;
    private final RythmicString endFamFemale;
    private final RythmicString endPatMale;
    private final RythmicString endPatFemale;

    private GrCaseEnding(RythmicString endNameMale, RythmicString endNameFemale, RythmicString famMale, RythmicString famFemale, RythmicString patMale, RythmicString patFemale) {
        this.endNameMale = endNameMale;
        this.endNameFemale = endNameFemale;
        this.endFamMale = famMale;
        this.endFamFemale = famFemale;
        this.endPatMale = patMale;
        this.endPatFemale = patFemale;
    }

    /**
     *
     * @return окончание мужского имени
     */
    public RythmicString getEndNameMale() {
        return endNameMale;
    }

    /**
     *
     * @return окончание женского имени
     */
    public RythmicString getEndNameFemale() {
        return endNameFemale;
    }

    /**
     *
     * @return окончание мужской фамилии
     */
    public RythmicString getMaleFamEnd() {
        return endFamMale;
    }

    /**
     *
     * @return окончание женской фамилии
     */
    public RythmicString getFemaleFamEnd() {
        return endFamFemale;
    }

    /**
     *
     * @return окончание мужского отчества
     */
    public RythmicString getMalePatEnd() {
        return endPatMale;
    }

    /**
     *
     * @return окончание женского отчества
     */
    public RythmicString getFemalePatEnd() {
        return endPatFemale;
    }
}
