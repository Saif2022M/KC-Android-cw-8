package com.example.x_cite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Phons>PhonesList=new ArrayList<>();
    private Object PHonAdabter;
    private Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn  = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(findViewById(R.id.rootLyout),"Undo ",Snackbar.LENGTH_LONG);
                snackbar.setAction("Undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "البوووووونص ",Toast.LENGTH_SHORT).show();
                    }
                });
                     snackbar.setActionTextColor(Color.GREEN );
                      snackbar.show();
            }
        });




        Phons Iphone14 = new Phons("Iphone14","Apple",R.drawable.iphonee,"لمحة سريعة:\n" +
                "شاشة Super Retina XDR مقاس 6.1 إنش\n" +
                "يضيف الوضع السينمائي عمقًا سطحيًا للمجال ويغير التركيز تلقائيًا في مقاطع الفيديو الخاصة بك\n" +
                "نظام كاميرا مزدوجة متقدم مع كاميرا 12 ميجابكسل واسعة وكاميرا فائقة الاتساع ؛ أنماط التصوير الفوتوغرافي ، Smart HDR 4 ، الوضع الليلي ، تسجيل 4K Dolby Vision HDR\n" +
                "كاميرا TrueDepth أمامية بدقة 12 ميجابكسل مع الوضع الليلي وتسجيل 4K Dolby Vision HDR\n" +
                "شريحة A15 Bionic لأداء فائق السرعة\n" +
                "ما يصل إلى 19 ساعة من تشغيل الفيديو\n" +
                "تصميم متين مع درع سيراميك\n" +
                "مقاومة الماء IP68 الرائدة في الصناعة\n" +
                "5G للتنزيل فائق السرعة والبث عالي الجودة\n" +
                "يحزم iOS 15 ميزات جديدة للقيام بالمزيد مع iPhone أكثر من أي وقت مضى\n" +
                "يدعم ملحقات MagSafe لتوصيل سهل وشحن لاسلكي أسرع");
        Phons ipad = new Phons("Ipad 11 Pro","Apple",R.drawable.ipad,"شريحة M1، جهازiPad Pro هو الأسرع من جنسه. مصمم ليستفيد من أداء التقنيات المستوى المتطور مثل معالج الصور والذاكرة الموحدة M1هندسة M1. ومع قوة M1الفعالة، يظل iPad Proرفيع وخفيف مع بطارية تدوم طوال اليوم، مما يجعل محمول وبنفس الوقت قوي.\n" +
                "\n" +
                "محرك 16-كور بوترال لأداء وجرافيكس سريعين\n" +
                "\n" +
                "وحدة المعالجة المركزية 8-كور من M1 توفر حتى 50% أداء أسرع. و يملك M1 مستواه الخاص من وحدة المعالجة المركزية 8-كور، ليوفر حتى 40% جرافيكس أسرع لـiPad Pro . حتى تستطيع أن تلعب الألعاب مع جرافيكس بجودة جهاز الألعاب مع معدل إطار عالي والمزيد.\n" +
                "\n" +
                "محرك 16-كور بوترال لأداء وجرافيكس سريعين\n" +
                "5جي والواي-فاي. اصدقاء السرعة\n" +
                "\n" +
                "5جي والواي-فاي. اصدقاء السرعة\n" +
                "كاميرا المحترفين\n" +
                "\n" +
                "كاميرا Wide و Ultra Wide تساعدك في إلتقاط الصور أو الفيديو المثالي، أو حتى تصنع فيديو بكاميرات متعددة. ومع ISP الاكثر قوة الموجود في شريحة M1 ، يوفر iPad Proالآن وظائف Smart HDR 3.\n" +
                "\n" +
                "كاميرا المحترفين\n" +
                "LiDAR\n" +
                "\n" +
                "LiDAR  \n" +
                "الماسح الضوئي LiDAR يقوم بقياس المدة التي تأخذها الضوء لينعكس على الأشياء، لذلك يمكنك أن تخترع أي خريطة من أي مساحة حتى تفتح تجربة مبهرة AR . ويعمل مع ISP القوي لتركيز الصور والفيديو اكثر دقة في وضعيات الضوء المنخفظ ويقلل من وقت الإلتقاط.");
        Phons MetBooks = new Phons("MetBook D15","Huawei",R.drawable.metbook,"يعمل جهاز HUAWEI MateBook D 15 بمعالج AMD Ryzen 7 3700U 4 ، والذي يعمل على تسريع الأداء وتحسينه. مزود بـ PCIe SSD 5 ، وسعة تخزين تصل إلى 16 جيجابايت في ذاكرة DDR4 RAM ، وسرعات القراءة والكتابة الخاصة به سريعة للغاية. مع بطاقة رسومات Radeon ™ RX Vega 10 ، يمكنك إتقان العمل اليومي أو الاستمتاع بالترفيه دون أي جهد.");
        Phons Nokia = new Phons("Nokia N73","Nokia",R.drawable.nokia,"يعتبر هاتف نوكيا N73 من الأكثر تداولا واستخداما ومبيعا نظرا لإمكانياته الهائلة حيث جودة التصوير بكاميرا 3.2 ميجا بيكسيل وتتميز مكتبة الموسيقى بتحرير مفتوح لبيانات المقاطع الصوتية مع إمكانية تعريبها ... حيث مرفق مع الهاتف سماعة أذن متطورة وذكية من نوعها (media) لتمكن المستخدم من خلالها التحكم الكامل في إدارة مشغل الموسيقى وبعض الوسائط كما يشاء ... مزود الهاتف بمفتاح توجيه رباعي لسهولة اللهو في الألعاب وتصفح الإنترنت بسهولة مع متصفح مزود بعداد الإستهلاك حيث أضيف له مؤخرا برامج التلفاز وخريطة تحديد الأماكن.أطلق هذا الهاتف في أوائل 2007 أما عن وضعية إنتاجه حاليا فقد توقف إنتاجه");
        Phons Nova = new Phons("Nova 7 S","Huawei",R.drawable.nova,"\n" +
                "سعر و مواصفات Huawei Nova 7 5Gقارن بين هاتفين\n" +
                "المعالج: ثماني النواة Kirin 985 5G تكنولوجيا 7 نانو\n" +
                "التخزين / الرام: 256 جيجا مع 8 جيجا رام\n" +
                "الكاميرا: خلفية رباعية 64+8+8+2 م.ب. / امامية 32 م.ب.\n" +
                "الشاشة: 6.53 بوصة بدقة FHD+ بها ثقب صغير\n" +
                "نظام التشغيل: اندرويد 10.0\n" +
                "البطارية: 4000 مللي أمبير\n" +
                "السعر ومراجعة سريعة للموبايل\n" +
                "\n" +
                "أعلنت هواوي عن هاتفها الأحدث الـ Huawei Nova 7 5G مع كاميرات خلفية وتصميم خرافي يليق بـ عام 2020 مع الاهتمام بجعل الوزن خفيف ليسهل استخدامه وليكون أول هاتف 5G سيتم توفيره بشكل رسمي مع شاشة اموليد بشكل الثقب وبصفته أحد أقوى الهواتف في سلسلة النوفا 7 الجديدة من هواوي فإن الهاتف يأتي بمعالج من نوع Kirin 985 مما يضمن لك الحصول على أقوى أداء ممكن فلا شك أن هواوي أحد أفضل الشركات في عالم الهواتف الذكية ولكن منذ مشكلتها مع أمريكا فالشركة لم تعد قادرة على التنافس بدون خدمات جوجل ولكن هل ستعوض المستخدم عن ذلك بوضع مواصفات أفضل أو سعر أقل ! دعونا نستعرض المواصفات الكاملة لهاتف Huawei Nova 7 5G وما هي أهم مميزاته وعيوبه وهل يستحق الشراء أم لا على النحو التالي .");
        Phons S22 = new Phons("S22 Ultra ", "Samsung",R.drawable.s22,"شاشة S22 Ultra هي شاشة مبهرة عملاقة 6.8 بوصة من نوع Dinamic AMOLED الجيل الثاني بدقة بتوصل لـQHD+ مع تردد بيوصل لـ120 هيرتز وسطوع بيوصل لـ1750 شمعة .. تجربة ممتازة تضاهي وتتفوق على شاشة iPhone 13 Pro في بعض الحالات.\n" +
                "\n" +
                "شاشة S22 Ultra فيها Curves قوية، بتحسن من مسكة الموبايل في الإيد وبيقدملك فخامة غير عادية لشكل الشاشة، الحافة اللي فوق قد الحافة اللي تحت وثقب السيلفي صغير جدًا .. بس للأسف بيتزحلق بسهولة.\n" +
                "\n" +
                "الشاشة بتنزل لـ1 هيرتز وبتطلع لـ120 هيرتز علشان تحسن من إستهلاك البطارية وفي نفس الوقت تقدملك أداء Smooth في الوقت اللي انت محتاج فيه معدل تحديث عالي.");
        Phons watch = new Phons("Watch 7","Apple",R.drawable.watch,"تميز شاشة ريتينا التي تعمل دائماً بمساحة شاشة أكبر بنسبة 20٪ تقريباً من سلسلة 6 ، مما يجعل رؤية كل شيء واستخدامه أسهل\n" +
                "الكريستال الأمامي الأكثر مقاومة للتشقق حتى الآن على ساعة آبل، ومقاومة الغبار وتصميم مقاوم للماء (IP6X)\n" +
                "قم بقياس نسبة الأكسجين في الدم باستخدام مستشعر وتطبيق قويين\n" +
                "خذ مخطط كهربية القلب في أي وقت وفي أي مكان\n" +
                "احصل على إشعارات بشأن معدل ضربات القلب المرتفع والمنخفض ، وإشعارات عدم انتظام ضربات القلب\n" +
                "ابقَ في لحظة مع تطبيق Mindfulness الجديد ، وحقق أهدافك المتعلقة بالنوم باستخدام تطبيق Sleep\n" +

                "ادفع فوراً وبأمان من معصمك باستخدام Apple Pay\n" +
                "بطارية تدوم طوال اليوم وشحن أسرع\n" +
                "يقدم watchOS 8 أنواعاً جديدة من التمارين ، وتطبيق Mindfulness ، ووجه ساعة Portraits الجديد ، وتحسينات للرسائل\n" +
                "تأتي ساعة آبل مع 3 أشهر مجانية من اللياقة البدنية ، والتي تقدم تدريبات على مستوى عالمي من قبل أفضل المدربين في العالم");


        PhonesList.add(Iphone14);
        PhonesList.add(ipad);
        PhonesList.add(MetBooks);
        PhonesList.add(Nokia);
        PhonesList.add(Nova);
        PhonesList.add(S22);
        PhonesList.add(watch);


        ListView listView = findViewById(R.id.list);

        PHonAdabter Adabtar = new PHonAdabter(this,0,PhonesList);

        listView.setAdapter(Adabtar);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Phons currentPhons = PhonesList.get(i);


                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("THEPHONEs",currentPhons);
                startActivity(intent);

            }
        });



    }



}