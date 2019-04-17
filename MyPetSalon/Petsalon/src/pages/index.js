import styles from './index.css';
import Link from "umi/link";

export default function() {
  return (
    <div className={styles.normal}>
      <div className={styles.welcome} />
          <Link to="/Owner">Go to Owner page</Link>
    </div>
  );
}
