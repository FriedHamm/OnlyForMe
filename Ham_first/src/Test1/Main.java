package Test1;

import FlashCard.FlashCardApp;

/**
 *
 *
 *
 */

public class Main{
    public static void main(String[] args) {


        FlashCardApp app1 = new FlashCardApp();
//        FlashCardApp app1 = new FlashCardApp();
//        FlashCardApp app1 = new FlashCardApp();
//        FlashCardApp app1 = new FlashCardApp();
//        FlashCardApp app1 = new FlashCardApp();
//        FlashCardApp app1 = new FlashCardApp();
//        FlashCardApp app1 = new FlashCardApp();
//        FlashCardApp app1 = new FlashCardApp();
//        FlashCardApp app1 = new FlashCardApp();

        app1.setLaw("제2조","신의성실","권리의 행사와 의무의 이행은 신의에 좇아 성실히 하여야 한다.",
                "권리는 남용하지 못한다.");
        app1.setLaw("제3조","권리능력의 존속기간", "사람은 생존한 동안 권리와 의무의 주체가 된다.");
        app1.setLaw("제4조","성년", "사람은 19세로 성년에 이르게 된다.");
        app1.setLaw("제5조","미성년자의 능력","미성년자가 법률행위를 함에는 법정대리인의 동의를 얻어야 한다. 그러나 권리만을 얻거나 의무만을 면하는 행위는 그러하지 아니하다.",
                "전항의 규정에 위반한 행위는 취소할 수 있다.");
        app1.setLaw("제6조","처분을 허락한 재산", "법정대리인이 범위를 정하여 처분을 허락한 재산은 미성년자가 임의로 처분할 수 있다.");
        app1.setLaw("제7조","동의와 허락의 취소", "법정대리인은 미성년자가 아직 법률행위를 하기 전에는 전2조의 동의와 허락을 취소할 수 있다.");
        app1.setLaw("제8조","영업의 허락" ,"미성년자가 법정대리인으로부터 허락을 얻은 특정한 영업에 관하여는 성년자와 동일한 행위능력이 있다.",
                "법정대리인은 전항의 허락을 취소 또는 제한할 수 있다. 그러나 선의의 제삼자에게 대항하지 못한다.");
        app1.setLaw("제9조","성년후견개시의 심판",  "가정법원은 질병, 장애, 노령, 그 밖의 사유로 인한 정신적 제약으로 사무를 처리할 능력이 지속적으로 결여된 사람에 대하여 본인, 배우자, 4촌 이내의 친족, 미성년후견인, 미성년후견감독인, 한정후견인, 한정후견감독인, 특정후견인, 특정후견감독인, 검사 또는 지방자치단체의 장의 청구에 의하여 성년후견개시의 심판을 한다.",
                "가정법원은 성년후견개시의 심판을 할 때 본인의 의사를 고려하여야 한다.");
        app1.setLaw("제10조","피성년후견인의 행위와 취소", "피성년후견인의 법률행위는 취소할 수 있다.",
                "제1항에도 불구하고 가정법원은 취소할 수 없는 피성년후견인의 법률행위의 범위를 정할 수 있다.",
                "가정법원은 본인, 배우자, 4촌 이내의 친족, 성년후견인, 성년후견감독인, 검사 또는 지방자치단체의 장의 청구에 의하여 제2항의 범위를 변경할 수 있다.",
                "제1항에도 불구하고 일용품의 구입 등 일상생활에 필요하고 그 대가가 과도하지 아니한 법률행위는 성년후견인이 취소할 수 없다.");

        app1.setLaw("제15조","제한능력자의 상대방의 확답을 촉구할 권리", "제한능력자의 상대방은 제한능력자가 능력자가 된 후에 그에게 1개월 이상의 기간을 정하여 그 취소할 수 있는 행위를 추인할 것인지 여부의 확답을 촉구할 수 있다. 능력자로 된 사람이 그 기간 내에 확답을 발송하지 아니하면 그 행위를 추인한 것으로 본다.",
                "제한능력자가 아직 능력자가 되지 못한 경우에는 그의 법정대리인에게 제1항의 촉구를 할 수 있고, 법정대리인이 그 정하여진 기간 내에 확답을 발송하지 아니한 경우에는 그 행위를 추인한 것으로 본다.",
                "특별한 절차가 필요한 행위는 그 정하여진 기간 내에 그 절차를 밟은 확답을 발송하지 아니하면 취소한 것으로 본다.");
        app1.setLaw("제16조","제한능력자의 상대방의 철회권과 거절권", "제한능력자가 맺은 계약은 추인이 있을 때까지 상대방이 그 의사표시를 철회할 수 있다. 다만, 상대방이 계약 당시에 제한능력자임을 알았을 경우에는 그러하지 아니하다.",
                "제한능력자의 단독행위는 추인이 있을 때까지 상대방이 거절할 수 있다.", "제1항의 철회나 제2항의 거절의 의사표시는 제한능력자에게도 할 수 있다.");
        app1.setLaw("제17조","제한능력자의 속임수", "제한능력자가 속임수로써 자기를 능력자로 믿게 한 경우에는 그 행위를 취소할 수 없다.",
                "미성년자나 피한정후견인이 속임수로써 법정대리인의 동의가 있는 것으로 믿게 한 경우에도 제1항과 같다.");
        app1.setLaw("제27조","실종의 선고", "부재자의 생사가 5년간 분명하지 아니한 때에는 법원은 이해관계인이나 검사의 청구에 의하여 실종선고를 하여야 한다.",
                "전지에 임한 자, 침몰한 선박 중에 있던 자, 추락한 항공기 중에 있던 자 기타 사망의 원인이 될 위난을 당한 자의 생사가 전쟁종지후 또는 선박의 침몰, 항공기의 추락 기타 위난이 종료한 후 1년간 분명하지 아니한 때에도 제1항과 같다.");
        app1.setLaw("제28조","실종선고의 효과", "실종선고를 받은 자는 전조의 기간이 만료한 때에 사망한 것으로 본다.");
        app1.setLaw("제29조","실종선고의 취소", "실종자의 생존한 사실 또는 전조의 규정과 상이한 때에 사망한 사실의 증명이 있으면 법원은 본인, 이해관계인 또는 검사의 청구에 의하여 실종선고를 취소하여야 한다. 그러나 실종선고후 그 취소전에 선의로 한 행위의 효력에 영향을 미치지 아니한다.",
                "실종선고의 취소가 있을 때에 실종의 선고를 직접원인으로 하여 재산을 취득한 자가 선의인 경우에는 그 받은 이익이 현존하는 한도에서 반환할 의무가 있고 악의인 경우에는 그 받은 이익에 이자를 붙여서 반환하고 손해가 있으면 이를 배상하여야 한다.");
        app1.setLaw("제31조","법인성립의 준칙", "법인은 법률의 규정에 의함이 아니면 성립하지 못한다.");
        app1.setLaw("제32조","비영리법인의 설립과 허가", "학술, 종교, 자선, 기예, 사교 기타 영리아닌 사업을 목적으로 하는 사단 또는 재단은 주무관청의 허가를 얻어 이를 법인으로 할 수 있다.");
        app1.setLaw("제33조","법인설립의 등기", "법인은 그 주된 사무소의 소재지에서 설립등기를 함으로써 성립한다.");
        app1.setLaw("제34조","법인의 권리능력", "법인은 법률의 규정에 좇아 정관으로 정한 목적의 범위내에서 권리와 의무의 주체가 된다.");

        app1.setLaw("제35조","법인의 불법행위능력", "법인은 이사 기타 대표자가 그 직무에 관하여 타인에게 가한 손해를 배상할 책임이 있다. 이사 기타 대표자는 이로 인하여 자기의 손해배상책임을 면하지 못한다.",
                "법인의 목적범위외의 행위로 인하여 타인에게 손해를 가한 때에는 그 사항의 의결에 찬성하거나 그 의결을 집행한 사원, 이사 및 기타 대표자가 연대하여 배상하여야 한다.");
        app1.setLaw("제41조","이사의 대표권에 대한 제한", "이사의 대표권에 대한 제한은 이를 정관에 기재하지 아니하면 그 효력이 없다.");
        app1.setLaw("제47조","증여, 유증에 관한 규정의 준용", "생전처분으로 재단법인을 설립하는 때에는 증여에 관한 규정을 준용한다.", "유언으로 재단법인을 설립하는 때에는 유증에 관한 규정을 준용한다.");
        app1.setLaw("제48조","출연재산의 귀속시기", "생전처분으로 재단법인을 설립하는 때에는 출연재산은 법인이 성립된 때로부터 법인의 재산이 된다.",
                "유언으로 재단법인을 설립하는 때에는 출연재산은 유언의 효력이 발생한 때로부터 법인에 귀속한 것으로 본다.");
        app1.setLaw("제49조","법인의 등기사항", "법인설립의 허가가 있는 때에는 3주간내에 주된 사무소소재지에서 설립등기를 하여야 한다.",
                "전항의 등기사항은 다음과 같다. 1. 목적 2. 명칭 3. 사무소 4. 설립허가의 연월일 5. 존립시기나 해산이유를 정한 때에는 그 시기 또는 사유 6. 자산의 총액 7. 출자의 방법을 정한 때에는 그 방법 8. 이사의 성명, 주소 9. 이사의 대표권을 제한한 때에는 그 제한");
        app1.setLaw("제56조","사원권의 양도, 상속금지", "사단법인의 사원의 지위는 양도 또는 상속할 수 없다.");
        app1.setLaw("제59조","이사의 대표권", "이사는 법인의 사무에 관하여 각자 법인을 대표한다. 그러나 정관에 규정한 취지에 위반할 수 없고 특히 사단법인은 총회의 의결에 의하여야 한다.",
                "법인의 대표에 관하여는 대리에 관한 규정을 준용한다.");
        app1.setLaw("제60조","이사의 대표권에 대한 제한의 대항요건", "이사의 대표권에 대한 제한은 등기하지 아니하면 제삼자에게 대항하지 못한다.");
        app1.setLaw("제61조","이사의 주의의무", "이사는 선량한 관리자의 주의로 그 직무를 행하여야 한다.");
        app1.setLaw("제62조","이사의 대리인 선임", "이사는 정관 또는 총회의 결의로 금지하지 아니한 사항에 한하여 타인으로 하여금 특정한 행위를 대리하게 할 수 있다.");

        app1.setLaw("제65조","이사의 임무해태", "이사가 그 임무를 해태한 때에는 그 이사는 법인에 대하여 연대하여 손해배상의 책임이 있다.");
        app1.setLaw("제99조","부동산, 동산", "토지 및 그 정착물은 부동산이다.", "부동산 이외의 물건은 동산이다.");
        app1.setLaw("제124조","자기계약, 쌍방대리", "대리인은 본인의 허락이 없으면 본인을 위하여 자기와 법률행위를 하거나 동일한 법률행위에 관하여 당사자쌍방을 대리하지 못한다. 그러나 채무의 이행은 할 수 있다.");
        app1.setLaw("제125조","대리권수여의 표시에 의한 표현대리", "제삼자에 대하여 타인에게 대리권을 수여함을 표시한 자는 그 대리권의 범위내에서 행한 그 타인과 그 제삼자간의 법률행위에 대하여 책임이 있다. 그러나 제삼자가 대리권없음을 알았거나 알 수 있었을 때에는 그러하지 아니하다.");
        app1.setLaw("제126조","권한을 넘은 표현대리", "대리인이 그 권한외의 법률행위를 한 경우에 제삼자가 그 권한이 있다고 믿을 만한 정당한 이유가 있는 때에는 본인은 그 행위에 대하여 책임이 있다.");
        app1.setLaw("제129조","대리권소멸후의 표현대리", "대리권의 소멸은 선의의 제삼자에게 대항하지 못한다. 그러나 제삼자가 과실로 인하여 그 사실을 알지 못한 때에는 그러하지 아니하다.");
        app1.setLaw("제130조","무권대리", "대리권없는 자가 타인의 대리인으로 한 계약은 본인이 이를 추인하지 아니하면 본인에 대하여 효력이 없다.");
        app1.setLaw("제133조","추인의 효력", "추인은 다른 의사표시가 없는 때에는 계약시에 소급하여 그 효력이 생긴다. 그러나 제삼자의 권리를 해하지 못한다.");
        app1.setLaw("제135조","상대방에 대한 무권대리인의 책임", "다른 자의 대리인으로서 계약을 맺은 자가 그 대리권을 증명하지 못하고 또 본인의 추인을 받지 못한 경우에는 그는 상대방의 선택에 따라 계약을 이행할 책임 또는 손해를 배상할 책임이 있다.",
                "대리인으로서 계약을 맺은 자에게 대리권이 없다는 사실을 상대방이 알았거나 알 수 있었을 때 또는 대리인으로서 계약을 맺은 사람이 제한능력자일 때에는 제1항을 적용하지 아니한다.");
        app1.setLaw("제139조","무효행위의 추인", "무효인 법률행위는 추인하여도 그 효력이 생기지 아니한다. 그러나 당사자가 그 무효임을 알고 추인한 때에는 새로운 법률행위로 본다.");

        app1.setLaw("제140조","법률행위의 취소권자", "취소할 수 있는 법률행위는 제한능력자, 착오로 인하거나 사기 . 강박에 의하여 의사표시를 한 자, 그의 대리인 또는 승계인만이 취소할 수 있다.");
        app1.setLaw("제141조","취소의 효과", "취소된 법률행위는 처음부터 무효인 것으로 본다. 다만, 제한능력자는 그 행위로 인하여 받은 이익이 현존하는 한도에서 상환할 책임이 있다.");
        app1.setLaw("제143조","추인의 방법, 효과" ,"취소할 수 있는 법률행위는 제140조에 규정한 자가 추인할 수 있고 추인후에는 취소하지 못한다.");
        app1.setLaw("제146조","취소권의 소멸", "취소권은 추인할 수 있는 날로부터 3년내에 법률행위를 한 날로부터 10년내에 행사하여야 한다.");
        app1.setLaw("제155조","본장의 적용범위", "기간의 계산은 법령, 재판상의 처분 또는 법률행위에 다른 정한 바가 없으면 본장의 규정에 의한다.");
        app1.setLaw("제156조","기간의 기산점", "기간을 시, 분, 초로 정한 때에는 즉시로부터 기산한다.");
        app1.setLaw("제157조","기간의 기산점", "기간을 일, 주, 월 또는 연으로 정한 때에는 기간의 초일은 산입하지 아니한다. 그러나 그 기간이 오전 영시로부터 시작하는 때에는 그러하지 아니하다.");
        app1.setLaw("제158조","나이의 계산과 표시", "나이는 출생일을 산입하여 만 나이로 계산하고, 연수로 표시한다. 다만, 1세에 이르지 아니한 경우에는 월수로 표시할 수 있다.");
        app1.setLaw("제159조","기간의 만료점", "기간을 일, 주, 월 또는 연으로 정한 때에는 기간말일의 종료로 기간이 만료한다.");
        app1.setLaw("제160조","역에 의한 계산", "기간을 주, 월 또는 연으로 정한 때에는 역에 의하여 계산한다.",
                "주, 월 또는 연의 처음으로부터 기간을 기산하지 아니하는 때에는 최후의 주, 월 또는 연에서 그 기산일에 해당한 날의 전일로 기간이 만료한다.",
                "월 또는 연으로 정한 경우에 최종의 월에 해당일이 없는 때에는 그 월의 말일로 기간이 만료한다.");

        app1.setLaw("제186조","부동산물권변동의 효력", "부동산에 관한 법률행위로 인한 물권의 득실변경은 등기하여야 그 효력이 생긴다.");
        app1.setLaw("제187조","등기를 요하지 아니하는 부동산물권취득", "상속, 공용징수, 판결, 경매 기타 법률의 규정에 의한 부동산에 관한 물권의 취득은 등기를 요하지 아니한다. 그러나 등기를 하지 아니하면 이를 처분하지 못한다.");
        app1.setLaw("제188조","동산물권양도의 효력, 간이인도", "동산에 관한 물권의 양도는 그 동산을 인도하여야 효력이 생긴다.", "양수인이 이미 그 동산을 점유한 때에는 당사자의 의사표시만으로 그 효력이 생긴다.");
        app1.setLaw("제189조","점유개정", "동산에 관한 물권을 양도하는 경우에 당사자의 계약으로 양도인이 그 동산의 점유를 계속하는 때에는 양수인이 인도받은 것으로 본다.");
        app1.setLaw("제190조","목적물반환청구권의 양도", "제삼자가 점유하고 있는 동산에 관한 물권을 양도하는 경우에는 양도인이 그 제삼자에 대한 반환청구권을 양수인에게 양도함으로써 동산을 인도한 것으로 본다.");
        app1.setLaw("제209조","자력구제", "점유자는 그 점유를 부정히 침탈 또는 방해하는 행위에 대하여 자력으로써 이를 방위할 수 있다.", "점유물이 침탈되었을 경우에 부동산일 때에는 점유자는 침탈후 직시 가해자를 배제하여 이를 탈환할 수 있고 동산일 때에는 점유자는 현장에서 또는 추적하여 가해자로부터 이를 탈환할 수 있다.");
        app1.setLaw("제213조","소유물반환청구권", "소유자는 그 소유에 속한 물건을 점유한 자에 대하여 반환을 청구할 수 있다. 그러나 점유자가 그 물건을 점유할 권리가 있는 때에는 반환을 거부할 수 있다.");
        app1.setLaw("제214조","소유물방해제거, 방해예방청구권", "소유자는 소유권을 방해하는 자에 대하여 방해의 제거를 청구할 수 있고 소유권을 방해할 염려있는 행위를 하는 자에 대하여 그 예방이나 손해배상의 담보를 청구할 수 있다.");
        app1.setLaw("제249조","선의취득", "평온, 공연하게 동산을 양수한 자가 선의이며 과실없이 그 동산을 점유한 경우에는 양도인이 정당한 소유자가 아닌 때에도 즉시 그 동산의 소유권을 취득한다.");
        app1.setLaw("제256조","부동산에의 부합", "부동산의 소유자는 그 부동산에 부합한 물건의 소유권을 취득한다. 그러나 타인의 권원에 의하여 부속된 것은 그러하지 아니하다.");

        app1.setLaw("제356조","저당권의 내용", "저당권자는 채무자 또는 제삼자가 점유를 이전하지 아니하고 채무의 담보로 제공한 부동산에 대하여 다른 채권자보다 자기채권의 우선변제를 받을 권리가 있다.");
        app1.setLaw("제369조","부종성", "저당권으로 담보한 채권이 시효의 완성 기타 사유로 인하여 소멸한 때에는 저당권도 소멸한다.");
        app1.setLaw("제389조","강제이행", "전항의 채무가 법률행위를 목적으로 한 때에는 채무자의 의사표시에 갈음할 재판을 청구할 수 있고 채무자의 일신에 전속하지 아니한 작위를 목적으로 한 때에는 채무자의 비용으로 제삼자에게 이를 하게 할 것을 법원에 청구할 수 있다.");
        app1.setLaw("제433조","보증인과 주채무자항변권", "주채무자의 항변포기는 보증인에게 효력이 없다.");
        app1.setLaw("제629조","임차권의 양도, 전대의 제한", "임차인은 임대인의 동의없이 그 권리를 양도하거나 임차물을 전대하지 못한다.", "임차인이 전항의 규정에 위반한 때에는 임대인은 계약을 해지할 수 있다.");
        app1.setLaw("제631조","전차인의 권리의 확정", "임차인이 임대인의 동의를 얻어 임차물을 전대한 경우에는 임대인과 임차인의 합의로 계약을 종료한 때에도 전차인의 권리는 소멸하지 아니한다.");
        app1.setLaw("제640조","차임연체와 해지", "건물 기타 공작물의 임대차에는 임차인의 차임연체액이 2기의 차임액에 달하는 때에는 임대인은 계약을 해지할 수 있다.");
        app1.setLaw("제741조","부당이득의 내용", "법률상 원인없이 타인의 재산 또는 노무로 인하여 이익을 얻고 이로 인하여 타인에게 손해를 가한 자는 그 이익을 반환하여야 한다.");
        app1.setLaw("제750조","불법행위의 내용", "고의 또는 과실로 인한 위법행위로 타인에게 손해를 가한 자는 그 손해를 배상할 책임이 있다.");
        app1.setLaw("제751조","재산 이외의 손해의 배상", "타인의 신체, 자유 또는 명예를 해하거나 기타 정신상고통을 가한 자는 재산 이외의 손해에 대하여도 배상할 책임이 있다.",
                "법원은 전항의 손해배상을 정기금채무로 지급할 것을 명할 수 있고 그 이행을 확보하기 위하여 상당한 담보의 제공을 명할 수 있다.");

        app1.setLaw("제752조","생명침해로 인한 위자료", "타인의 생명을 해한 자는 피해자의 직계존속, 직계비속 및 배우자에 대하여는 재산상의 손해없는 경우에도 손해배상의 책임이 있다.");
        app1.setLaw("제762조","손해배상청구권에 있어서의 태아의 지위", "태아는 손해배상의 청구권에 관하여는 이미 출생한 것으로 본다.");
        app1.setLaw("제808조","동의가 필요한 혼인", "미성년자가 혼인을 하는 경우에는 부모의 동의를 받아야 하며, 부모 중 한쪽이 동의권을 행사할 수 없을 때에는 다른 한쪽의 동의를 받아야 하고, 부모가 모두 동의권을 행사할 수 없을 때에는 미성년후견인의 동의를 받아야 한다.","피성년후견인은 부모나 성년후견인의 동의를 받아 혼인할 수 있다.");
        app1.setLaw("제810조","중혼의 금지", "배우자 있는 자는 다시 혼인하지 못한다.");
        app1.setLaw("제827조","부부간의 가사대리권", "부부는 일상의 가사에 관하여 서로 대리권이 있다.",
                "전항의 대리권에 가한 제한은 선의의 제삼자에게 대항하지 못한다.");
        app1.setLaw("제830조","특유재산과 귀속불명재산", "부부의 일방이 혼인전부터 가진 고유재산과 혼인중 자기의 명의로 취득한 재산은 그 특유재산으로 한다.",
                "부부의 누구에게 속한 것인지 분명하지 아니한 재산은 부부의 공유로 추정한다.");
        app1.setLaw("제832조","가사로 인한 채무의 연대책임", "부부의 일방이 일상의 가사에 관하여 제삼자와 법률행위를 한 때에는 다른 일방은 이로 인한 채무에 대하여 연대책임이 있다. 그러나 이미 제삼자에 대하여 다른 일방의 책임없음을 명시한 때에는 그러하지 아니하다.");
        app1.setLaw("제835조","성년후견과 협의상 이혼", "피성년후견인의 협의상 이혼에 관하여는 제808조제2항을 준용한다.");
        app1.setLaw("제844조","남편의 친생자의 추정", "아내가 혼인 중에 임신한 자녀는 남편의 자녀로 추정한다.",
                "혼인이 성립한 날부터 200일 후에 출생한 자녀는 혼인 중에 임신한 것으로 추정한다.",
                "혼인관계가 종료된 날부터 300일 이내에 출생한 자녀는 혼인 중에 임신한 것으로 추정한다.");
        app1.setLaw("제846조","자의 친생부인", "부부의 일방은 제844조의 경우에 그 자가 친생자임을 부인하는 소를 제기할 수 있다.");

        app1.setLaw("제847조","친생부인의 소", "친생부인의 소는 부 또는 처가 다른 일방 또는 자를 상대로 하여 그 사유가 있음을 안 날부터 2년내에 이를 제기하여야 한다.",
                "제1항의 경우에 상대방이 될 자가 모두 사망한 때에는 그 사망을 안 날부터 2년내에 검사를 상대로 하여 친생부인의 소를 제기할 수 있다.");
        app1.setLaw("제855조","인지", "혼인외의 출생자는 그 생부나 생모가 이를 인지할 수 있다. 부모의 혼인이 무효인 때에는 출생자는 혼인외의 출생자로 본다.",
                "혼인외의 출생자는 그 부모가 혼인한 때에는 그때로부터 혼인 중의 출생자로 본다.");
        app1.setLaw("제865조","다른 사유를 원인으로 하는 친생관계존부확인의 소", "제845조, 제846조, 제848조, 제850조, 제851조, 제862조와 제863조의 규정에 의하여 소를 제기할 수 있는 자는 다른 사유를 원인으로 하여 친생자관계존부의 확인의 소를 제기할 수 있다.",
                "제1항의 경우에 당사자일방이 사망한 때에는 그 사망을 안 날로부터 2년내에 검사를 상대로 하여 소를 제기할 수 있다.");
        app1.setLaw("제940조","후견인의 변경", "가정법원은 피후견인의 복리를 위하여 후견인을 변경할 필요가 있다고 인정하면 직권으로 또는 피후견인, 친족, 후견감독인, 검사, 지방자치단체의 장의 청구에 의하여 후견인을 변경할 수 있다.");
        app1.setLaw("제950조","후견감독인의 동의를 필요로 하는 행위", "후견인이 피후견인을 대리하여 다음 각 호의 어느 하나에 해당하는 행위를 하거나 미성년자의 다음 각 호의 어느 하나에 해당하는 행위에 동의를 할 때는 후견감독인이 있으면 그의 동의를 받아야 한다. 1. 영업에 관한 행위 2. 금전을 빌리는 행위 3. 의무만을 부담하는 행위 4. 부동산 또는 중요한 재산에 관한 권리의 득실변경을 목적으로 하는 행위 5. 소송행위 6. 상속의 승인, 한정승인 또는 포기 및 상속재산의 분할에 관한 협의");
        app1.setLaw("제999조","상속회복청구권", "상속권이 참칭상속권자로 인하여 침해된 때에는 상속권자 또는 그 법정대리인은 상속회복의 소를 제기할 수 있다.",
                "제1항의 상속회복청구권은 그 침해를 안 날부터 3년, 상속권의 침해행위가 있은 날부터 10년을 경과하면 소멸된다.");
        app1.setLaw("제1000조","상속의 순위", "상속에 있어서는 다음 순위로 상속인이 된다. 1. 피상속인의 직계비속 2. 피상속인의 직계존속 3. 피상속인의 형제자매 4. 피상속인의 4촌 이내의 방계혈족","전항의 경우에 동순위의 상속인이 수인인 때에는 최근친을 선순위로 하고 동친등의 상속인이 수인인 때에는 공동상속인이 된다.",
        "태아는 상속순위에 관하여는 이미 출생한 것으로 본다.");
        app1.setLaw("제1003조","배우자의 상속순위", "피상속인의 배우자는 제1000조제1항제1호와 제2호의 규정에 의한 상속인이 있는 경우에는 그 상속인과 동순위로 공동상속인이 되고 그 상속인이 없는 때에는 단독상속인이 된다.",
                "제1001조의 경우에 상속개시전에 사망 또는 결격된 자의 배우자는 동조의 규정에 의한 상속인과 동순위로 공동상속인이 되고 그 상속인이 없는 때에는 단독상속인이 된다.");
        app1.setLaw("제1009조","법정상속분", "동순위의 상속인이 수인인 때에는 그 상속분은 균분으로 한다.",
                "피상속인의 배우자의 상속분은 직계비속과 공동으로 상속하는 때에는 직계비속의 상속분의 5할을 가산하고, 직계존속과 공동으로 상속하는 때에는 직계존속의 상속분의 5할을 가산한다.");
        app1.setLaw("제1064조","유언과 태아, 상속결격자", "제1000조제3항, 제1004조의 규정은 수증자에 준용한다.");

        app1.turnOn();

    }
}

