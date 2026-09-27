# یکاری — پوستهٔ اندروید مشتری

پوستهٔ Kotlin که وب‌اپ مشتری (`yekari_customer`) را در WebView باز می‌کند. راهنمای کامل،
پیکربندی و پل JS در `README.md`.

## قواعد

- **کد `app/src/main/java/ir/yekari/shell/` با ریپوی `yekari_android_courier` یکی است.** هر تغییری در
  آن را در هر دو ریپو بزن. تفاوت‌ها فقط: بالای `app/build.gradle.kts`، `AppFeatures.kt`، منابع
  (`strings.xml`, `colors.xml`) و در پیک پوشهٔ `tracking/`.
- `namespace` در هر دو `ir.yekari.shell` است (برای یکی ماندن کد)؛ `applicationId` جداست.
- **مجوز را همان لحظهٔ نیاز بخواه** با `PermissionGate` — نه در `onCreate`.
- **پل بومی فقط روی میزبان‌های خود یکاری** (`Hosts.isApp`)؛ متد تازهٔ `@JavascriptInterface` باید از
  `ui {}` یا چک `trusted` رد شود و در `proguard-rules.pro` پوشش داده شده است.
- **وب‌اپ نباید مجبور به تغییر شود**؛ هرچه می‌شود با `NativeBridge.SHIM` (تزریق بعد از بارگذاری) پر کن.
- هیچ رمز/کلید امضا در ریپو نمی‌آید (`keystore.properties`, `*.jks` در `.gitignore`).
- متن‌های کاربر فارسی، در `strings.xml`.

## ساخت

محیط ابری Claude به `dl.google.com` دسترسی ندارد، پس این‌جا ساخت ممکن نیست؛ CI گیت‌هاب
(`.github/workflows/android.yml`) روی هر push و PR می‌سازد — قبل از ادغام سبز بودنش را ببین.
