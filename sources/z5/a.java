package z5;

import a6.h;
import java.util.HashSet;
import java.util.function.Consumer;
import n6.g;
import w5.d;
import w5.e;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8697a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f8698b;

    public /* synthetic */ a(b bVar, int i8) {
        this.f8697a = i8;
        this.f8698b = bVar;
    }

    public final void accept(Object obj) {
        d dVar;
        int i8 = this.f8697a;
        b bVar = this.f8698b;
        switch (i8) {
            case 0:
                bVar.f8702d.add(((a6.d) ((a6.a) obj)).f175b);
                return;
            default:
                HashSet hashSet = bVar.f8702d;
                h hVar = (h) ((a6.a) obj);
                hVar.getClass();
                HashSet hashSet2 = new HashSet();
                if (!g.e(hVar.f183b)) {
                    boolean z8 = false;
                    for (char c9 : hVar.f183b.toCharArray()) {
                        if (!z8) {
                            switch (c9) {
                                case EXERCISE_TYPE_ICE_SKATING_VALUE:
                                    z8 = true;
                                    continue;
                                case EXERCISE_TYPE_SOFTBALL_VALUE:
                                case EXERCISE_TYPE_HORSE_RIDING_VALUE:
                                case 'x':
                                    hashSet2.add(e.a(d.y));
                                    hashSet2.add(e.a(d.f8041o));
                                    break;
                                case EXERCISE_TYPE_STAIR_CLIMBING_VALUE:
                                case EXERCISE_TYPE_STAIR_CLIMBING_MACHINE_VALUE:
                                case EXERCISE_TYPE_INLINE_SKATING_VALUE:
                                case EXERCISE_TYPE_ROLLER_SKATING_VALUE:
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'g':
                                case 'w':
                                    dVar = d.K;
                                    break;
                                case EXERCISE_TYPE_STRETCHING_VALUE:
                                case EXERCISE_TYPE_MOUNTAIN_BIKING_VALUE:
                                case 'r':
                                case 'u':
                                case 'y':
                                    dVar = d.V;
                                    break;
                                case EXERCISE_TYPE_SURFING_VALUE:
                                case 'a':
                                case 'k':
                                    dVar = d.y;
                                    break;
                                case EXERCISE_TYPE_TABLE_TENNIS_VALUE:
                                case 'h':
                                    dVar = d.f8051u;
                                    break;
                                case EXERCISE_TYPE_TENNIS_VALUE:
                                case EXERCISE_TYPE_UPPER_TWIST_VALUE:
                                case EXERCISE_TYPE_WEIGHTLIFTING_VALUE:
                                case 'q':
                                    dVar = d.P;
                                    break;
                                case 'm':
                                    dVar = d.f8041o;
                                    break;
                                case 's':
                                    break;
                            }
                            dVar = d.f8033k;
                            hashSet2.add(e.a(dVar));
                        } else if (c9 == '\'') {
                            z8 = false;
                        }
                    }
                }
                hashSet.addAll(hashSet2);
                return;
        }
    }
}
